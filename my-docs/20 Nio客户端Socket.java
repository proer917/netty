Netty��������ΪHttp�ͻ��ˣ�Ҳ������ΪHttp��������

��ΪHttp�ͻ���ʱ��ֻҪ����һ��Channel:
org.jboss.netty.channel.socket.nio.NioClientSocketChannel

��ΪHttp��������ʱ��Ҫ��������Channel:
org.jboss.netty.channel.socket.nio.NioServerSocketChannel
org.jboss.netty.channel.socket.nio.NioAcceptedSocketChannel

1. ��ΪHttp�ͻ���ʱ


Netty�������߳�: Boss�߳� �� NioWorker�߳�
Boss�߳��Ƿ������ģ�ֻ��һ��Boss�̣߳����Դ�����NioClientSocketChannel��������NioClientSocketChannel����connect������
Boss�̻߳ᱻ�����Σ�������ý����µ�Channelʱ����ʱBoss�߳̿����ˣ��ͻ��˳���
�����µ�Channel��Ҫ���ӵ���������ʱ����������Boss�̡߳�

Channel���ӳɹ���Boss�̻߳��NioClientSocketChannelע���NioWorker�̣߳��ŵ�NioWorker�̵߳�registerTaskQueue��

NioWorker�߳�Ҳ�Ƿ������ģ�Ҳ���Դ�����NioClientSocketChannel��
���⣬��Netty��ΪHttp������ʱ��NioWorker�̻߳����Դ�����NioAcceptedSocketChannel��

Ҳ����˵org.jboss.netty.channel.socket.nio.NioWorker����������õģ�
��ΪHttp�ͻ���ʱ��NioWorker�̹߳���NioClientSocketChannel,
��ΪHttp������ʱ��NioWorker�̹߳���NioAcceptedSocketChannel��

������NioWorker�����Ĵ����е�����⡣



2. ��ΪHttp������ʱ

NettyҲ�������߳�: Boss�߳� �� NioWorker�߳�

��ʱ��Boss�̸߳�ǰ����ǲ�һ���ģ����Boss�߳��Ƿ������ģ����ἤ���Σ�ֻ��һ��Boss�߳�,
Boss�߳�һֱ�����У���������NioServerSocketChannel�������յ�������Socketʱ�������NioAcceptedSocketChannel��
Ȼ��ת����NioWorker�̴߳���

