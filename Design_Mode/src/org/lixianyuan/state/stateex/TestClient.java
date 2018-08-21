package org.lixianyuan.state.stateex;
//测试 客户端代码
public class TestClient {
	
	public static void main(String[] args) {
		//紧急项目
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
		 * finish为true时的打印结果：
		 * 		当前时间9.0点，上午工作精神百倍
				当前时间10.0点，上午工作精神百倍
				当前时间11.0点，上午工作精神百倍
				当前时间：12.0 饿了，午饭，犯困，午休
				当前工作时间:13.0下午状态还不错，继续努力
				当前工作时间:14.0下午状态还不错，继续努力
				当前时间:17.0点，加班哦，疲累之极
				当前时间：19.0点下班回家了
				当前时间：22.0点下班回家了
			
			
			finish为false的时候的打印结果：
				当前时间9.0点，上午工作精神百倍
				当前时间10.0点，上午工作精神百倍
				当前时间11.0点，上午工作精神百倍
				当前时间：12.0 饿了，午饭，犯困，午休
				当前工作时间:13.0下午状态还不错，继续努力
				当前工作时间:14.0下午状态还不错，继续努力
				当前时间:17.0点，加班哦，疲累之极
				当前时间:19.0点，加班哦，疲累之极
				当前时间：22.0点，不行了，睡着了
		 */
	}
}
