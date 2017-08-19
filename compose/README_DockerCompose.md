docker-compose -p toolchain up -d

docker stop $(docker ps -q -f name=toolchain)
docker rm $(docker ps -q -a -f name=toolchain)