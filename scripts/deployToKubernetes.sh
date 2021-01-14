#!/bin/sh

kubectl create ns sample
kubectl apply -f src/main/kubernetes/kubernetes.yml -n sample