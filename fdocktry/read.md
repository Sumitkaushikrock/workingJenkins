docker run -p 3375:2375 -v /var/run/docker.sock:/var/run/docker.sock -d shipyard/docker-proxy

Then run this command
1477  docker run -p 3375:2375 -v /var/run/docker.sock:/var/run/docker.sock -d shipyard/docker-proxy
This proxy exposes the host on 
Mac:- Docker.for.mac.localhost
Windows:- Docker.for.win.localhost
Unix:- Docker.host.internal

https://www.youtube.com/watch?v=jaaMNK0Df8U

1478  docker ps
1479  docker version
1480  docker ps
#Over here the container id is of the jenkins not the jenkins proxy
1481  docker exec 3d3c2b0a6b7d curl http://docker.for.mac.localhost:3375/v1.41/info
This will 


docker -H tcp://docker.for.mac.localhost:3375 images