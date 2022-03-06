from sys import exit
import api
import os

def build(kataId):
    """Build Kata and test files, and update README according to the
    Codewars API response"""
    verifyIfKataIdAlreadyExists(kataId)
    kataData = api.kataResponse(kataId)
    buildTemplateKata(kataData)
    buildTemplateTest(kataData)
    updateReadme(kataData)

def buildTemplateKata(kataData):
    variables = {
        "kata_rank" : str(kataData["rank"]["id"]*(-1)),
        "kata_name" : kataData["name"],
        "kata_id"   : kataData["id"],
        "kata_url"  : kataData["url"],
        "kata_class": kataSlugToKataClass(kataData["slug"])
    }
    source = "TemplateKata.java"
    target = "../src/main/java/codewars/kyu" + variables["kata_rank"] + "/" + variables["kata_class"] + ".java"
    buildTemplate(source, target, variables)

def buildTemplateTest(kataData):
    variables = {
        "kata_rank" : str(kataData["rank"]["id"]*(-1)),
        "kata_name" : kataData["name"],
        "kata_id"   : kataData["id"],
        "kata_url"  : kataData["url"],
        "kata_class": kataSlugToKataClass(kataData["slug"])
    }
    source = "TemplateTest.java"
    target = "../src/test/java/codewars/kyu" + variables["kata_rank"] + "/" + variables["kata_class"] + "Test.java"
    buildTemplate(source, target, variables)

def updateReadme(kataData):
    """Insert the new kata in the README table"""
    variables = {
        "kata_rank" : str(kataData["rank"]["id"]*(-1)),
        "kata_name" : kataData["name"],
        "kata_id"   : kataData["id"],
        "kata_url"  : kataData["url"],
        "kata_class": kataSlugToKataClass(kataData["slug"])
    }
    with open ("../README.md", 'r') as r:
        newContent = r.read()

    with open("../README.md", "w") as r:
        row  = "<tr>"
        row += "<td>" + variables["kata_rank"] + "</td>"
        row += "<td>"
        row += "<a href='" + variables["kata_url"] + "'>" + variables["kata_name"] + "</a>"
        row += "</td>"
        row += "<td>"
        row += "<a href='src/main/java/codewars/kyu" + variables["kata_rank"] + "/" + variables["kata_class"] + ".java'>" + variables["kata_class"] + ".java</a>"
        row += "</td>"
        row += "</tr>\n"
        row += "<!-- next kata " + variables["kata_rank"] + " -->"
        newContent = newContent.replace("<!-- next kata " + variables["kata_rank"] + " -->", row)
        r.write(newContent)

def buildTemplate(source, target, variables):
    """Build the source template using it's variables and output it to the target"""
    with open(source, 'r') as s, open(target, 'w') as t:
        sourceCode = s.read()
        for key, value in variables.items():
            sourceCode = sourceCode.replace("{" + key + "}", value)
        t.write(sourceCode)

def kataSlugToKataClass(kataSlug):
    """Tranform a kata slug to a camel case kata class"""
    pascalCase = ''.join(x for x in kataSlug.title() if not x == '-')
    # Java don't accept digits as the first char of a class name
    return f"Kata{pascalCase}" if pascalCase[0].isdigit() else pascalCase

def verifyIfKataIdAlreadyExists(kataId):
    """If kata id already exists, the program will exit"""
    completedKataList = api.completedListResponse("willpinha")
    for kata in completedKataList["data"]:
        if kata["id"] == kataId:
            exit("Kata already completed")
    