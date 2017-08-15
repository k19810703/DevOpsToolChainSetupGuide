From jenkins
user root
ADD get-pip.py /
RUN apt-get update \
&& apt-get install -y --force-yes --no-install-recommends software-properties-common \
&& apt-get install -y --force-yes --no-install-recommends ansible \
&& ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa \
&& python /get-pip.py \
&& pip install http://github.com/diyan/pywinrm/archive/master.zip#egg=pywinrm
ADD hosts /etc/ansible/

