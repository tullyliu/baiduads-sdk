#!/usr/bin/env bash

# Be sure your script exit whenever encounter errors
set -e

base_dir=$(dirname $0)


mvn -U clean install -Dmaven.test.skip=true -Dgpg.skip -f $base_dir/pom.xml


