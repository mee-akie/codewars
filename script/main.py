# This script automates the creation of new codewars kata in this repository
from sys import argv
import kata

kataId = argv[1] # Put the kata id as an argument

# Build all files
kata.build(kataId)
