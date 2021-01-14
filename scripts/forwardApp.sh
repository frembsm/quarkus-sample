#!/bin/sh
kubectl --namespace sample port-forward svc/quarkus-sample 8080:8080