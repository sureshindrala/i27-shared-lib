package com.i27academy.k8s

class K8s {
    def jenkins
    K8s(jenkins) {
        this.jenkins = jenkins
    }

    def auth_login() {
        jenkins.sh """#!/bin/bash
        echo "Entering Authentication method for GKE Cluster Login"
        gcloud config set account jenkins@nice-carving-411801.iam.gserviceaccount.com
        # gcloud auth activate-service-account enkins@nice-carving-411801.iam.gserviceaccount.com --key-file=key.json
        gcloud compute instances list
        echo "************* Listing Number of Nodes in K8S *************"
        gcloud container clusters get-credentials cart-cluster --zone us-west1-a --project nice-carving-411801
        kubectl get nodes
        """
    }
    
}