import cn.com.egova.easyshare.api.human.HumanActionApi;
import cn.com.egova.easyshare.common.dto.ResultDto;
import cn.com.egova.easyshare.common.entity.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientConsumer {
	public static void main(String[] args) throws InterruptedException{
		String configLocation="dubbo-consumer.xml";
		ApplicationContext context =new ClassPathXmlApplicationContext(configLocation);
		HumanActionApi userApi = (HumanActionApi) context.getBean("userAction");
		ResultDto<Human> u = userApi.getHuman(1);
		System.out.println(u);
	}

}
