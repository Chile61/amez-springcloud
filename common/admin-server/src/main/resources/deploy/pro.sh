#!/usr/bin/env bash
#jenkins项目名称
project=$1
#应用名称
app=admin-server
#模块名称
module=common
#jenkisn代码目录
cd /root/.jenkins/workspace/${project}/${module}/${app}
#maven打包和推镜像
mvn clean package -Pk8s docker:build -DpushImage
#yml目录
cd src/main/resources/deploy/yml
#部署
kubectl apply -f pro.yml


