docker cp jenkins:/root/.ssh/id_rsa.pub ./
cat id_rsa.pub >> ~/.ssh/authorized_keys
rm id_rsa.pub

