#!/usr/bin/env bash
kubectl delete -f /root/.jenkins/workspace/pc-api/cloud-pc/pc-api/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-api/cloud-pc/pc-api/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-financial/cloud-pc/pc-financial/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-financial/cloud-pc/pc-financial/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-im/cloud-pc/pc-im/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-im/cloud-pc/pc-im/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-learn/cloud-pc/pc-learn/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-learn/cloud-pc/pc-learn/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-member/cloud-pc/pc-member/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-member/cloud-pc/pc-member/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-order/cloud-pc/pc-order/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-order/cloud-pc/pc-order/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-crontab/cloud-pc/pc-crontab/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-crontab/cloud-pc/pc-crontab/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-product/cloud-pc/pc-product/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-product/cloud-pc/pc-product/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-store/cloud-pc/pc-store/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-store/cloud-pc/pc-store/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-system/cloud-pc/pc-system/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-system/cloud-pc/pc-system/src/main/resources/deploy/yml/pro.yml
kubectl delete -f /root/.jenkins/workspace/pc-umeng/cloud-pc/pc-umeng/src/main/resources/deploy/yml/pro.yml
kubectl apply -f /root/.jenkins/workspace/pc-umeng/cloud-pc/pc-umeng/src/main/resources/deploy/yml/pro.yml
