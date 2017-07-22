From jenkins
user root
RUN apt-get update \
&& apt-get install -y --force-yes --no-install-recommends software-properties-common \
&& apt-get install -y --force-yes --no-install-recommends ansible \
&& ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa
ADD hosts /etc/ansible/

