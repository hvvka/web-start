#!/bin/bash

ps -ef | grep tomcat | awk '{print $2}' | xargs kill -9
