https://www.digitalocean.com/community/tutorials/how-to-automate-jenkins-setup-with-docker-and-jenkins-configuration-as-code

docker build -t myjenkins .
docker run --name jenkins --rm -p 8080:8080 --env JENKINS_ADMIN_ID=admin --env JENKINS_ADMIN_PASSWORD=password -v /home/sumit/jenkinsdata:/var/jenkins_home myjenkins

docker run --name jenkins --rm -p 8080:8080 --env JENKINS_ADMIN_ID=admin --env JENKINS_ADMIN_PASSWORD=password  myjenkins

create volume
https://rangle.io/blog/running-jenkins-and-persisting-state-locally-using-docker-2/


Creating a new build
after the build..
Create pipeline build


