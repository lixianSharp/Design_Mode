package org.lixianyuan.state.stateex;
//���� �ͻ��˴���
public class TestClient {
	
	public static void main(String[] args) {
		//������Ŀ
		Work emergencyProjects = new Work();
		emergencyProjects.setHour(9);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(10);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(11);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(12);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(13);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(14);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(17);
		emergencyProjects.writeProgram();
		
		
		//emergencyProjects.setFinish(true);
		emergencyProjects.setFinish(false);
		
		
		emergencyProjects.setHour(19);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(22);
		emergencyProjects.writeProgram();
		
		/**
		 * finishΪtrueʱ�Ĵ�ӡ�����
		 * 		��ǰʱ��9.0�㣬���繤������ٱ�
				��ǰʱ��10.0�㣬���繤������ٱ�
				��ǰʱ��11.0�㣬���繤������ٱ�
				��ǰʱ�䣺12.0 ���ˣ��緹������������
				��ǰ����ʱ��:13.0����״̬����������Ŭ��
				��ǰ����ʱ��:14.0����״̬����������Ŭ��
				��ǰʱ��:17.0�㣬�Ӱ�Ŷ��ƣ��֮��
				��ǰʱ�䣺19.0���°�ؼ���
				��ǰʱ�䣺22.0���°�ؼ���
			
			
			finishΪfalse��ʱ��Ĵ�ӡ�����
				��ǰʱ��9.0�㣬���繤������ٱ�
				��ǰʱ��10.0�㣬���繤������ٱ�
				��ǰʱ��11.0�㣬���繤������ٱ�
				��ǰʱ�䣺12.0 ���ˣ��緹������������
				��ǰ����ʱ��:13.0����״̬����������Ŭ��
				��ǰ����ʱ��:14.0����״̬����������Ŭ��
				��ǰʱ��:17.0�㣬�Ӱ�Ŷ��ƣ��֮��
				��ǰʱ��:19.0�㣬�Ӱ�Ŷ��ƣ��֮��
				��ǰʱ�䣺22.0�㣬�����ˣ�˯����
		 */
	}
}
