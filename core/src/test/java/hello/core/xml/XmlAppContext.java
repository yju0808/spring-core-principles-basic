
package hello.core.xml;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import hello.core.member.MemberService;

public class XmlAppContext {

    @Test
    void xmlAppTest() {
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService   memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }

}