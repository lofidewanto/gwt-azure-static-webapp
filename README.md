# gwt-azure-static-webapp

Azure Static Webapp GWT Example

## Introduction

This example uses GWT Boot as Starter Parent: https://github.com/gwtboot/gwt-boot-samples

Take a look at this article to see the whole story: https://bit.ly/GWTAzureStaticsWebApps

This example should be deployed on Microsoft Azure Static Webapps: https://docs.microsoft.com/en-us/azure/static-web-apps

## How to build and run locally

To build the example:
```
mvn clean package
```

To run the example:
1. First: run the GWT Dev Mode: 
```
mvn gwt:generate-module gwt:devmode
```
2. Second: open your browser and go to following address:
```
http://127.0.0.1:8888/calculator/
```
3. GWT Dev Mode supports **automatic transpiling**. You just need to update your Java code in your IDE and **reload your web browser**. Your Java code will be automatically transpiled and your webapp stays uptodate without restarting the web server. If you change the **index.html** you need to push the **restart button** on the Swing GUI.

## How to run it on the Azure Static Webapps

The GitHub action is on this file: https://github.com/lofidewanto/gwt-azure-static-webapp/blob/main/.github/workflows/azure-static-web-apps-lively-pebble-036bda903.yml

Here is the status on the deployment: https://github.com/lofidewanto/gwt-azure-static-webapp/actions

For the result just go to: 
```
https://lively-pebble-036bda903.azurestaticapps.net 
```

Discussion about this topic: 
- GWT Google group: https://groups.google.com/g/google-web-toolkit/c/UUejbbyV4yQ/m/05wRt3NGBgAJ
- Twitter: https://twitter.com/lofidewanto/status/1400871145621053442?s=21
- Article at Medium: https://bit.ly/GWTAzureStaticsWebApps
