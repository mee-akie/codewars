import json
import requests

def kataResponse(kataId):
    """Returns kata information"""
    return response(f"https://www.codewars.com/api/v1/code-challenges/{kataId}")

def completedListResponse(user):
    """Returns a list of completed kata by the user"""
    return response(f"https://www.codewars.com/api/v1/users/{user}/code-challenges/completed")

def response(source):
    """Gets an API response and move it's JSON content to a dictionary"""
    response = requests.get(source)
    return json.loads(response.text)