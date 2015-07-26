import com.superheizai.dao.UserDao;
import com.superheizai.entity.User;
import com.superheizai.session.SessionsFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoTest {

    @Test
    public void findUserById() {

        Logger logger = LoggerFactory.getLogger("EventLogger");

        SqlSession sqlSession = SessionsFactory.INSTANCE.getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User user = userMapper.findById(1);
        logger.info("需要记录多名字是{}",user.getName());
        logger.error("需要记录多名字是{}", user.getName());
         sqlSession.close();
        logger.info(user.toString());
        Assert.assertNotNull("没找到数据", user);
    }


}
