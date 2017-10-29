# pingpongfy-api

[![Build Status](https://travis-ci.org/vicente-valls/pingpongfy-api.svg?branch=master)](https://travis-ci.org/vicente-valls/pingpongfy-api)
[![BCH compliance](https://bettercodehub.com/edge/badge/vicente-valls/pingpongfy-api?branch=master)](https://bettercodehub.com/)

# Introduction

Following repo implements the api described [here](https://github.com/vicente-valls/pingpongfy-doc#main-components)

## Requirements
* Maven `3.0.5`
* Java `1.8`
* Docker `1.13`

## Installation
```
$ cp src/main/resources/pingpongfy-api.dist.yml src/main/resources/pingpongfy-api.yml
$ mvn install
```
## Running Locally
```
$ mvn docker:run
```

## Testing
```
$ mvn test
```
