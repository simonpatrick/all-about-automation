#! /bin/bash

COMMENTS=$1
echo "your commit comments is $COMMENTS"

# git commit
git add .
git commit . -m "$COMMENTS"
git push

#publis to gh-pages branck
rake publish

