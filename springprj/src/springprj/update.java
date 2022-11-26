package springprj;

@Test
public class update {
	dao.deleteAll();

    dao.add(user1);

    user1.setName("고전파");
    user1.setPassword("1557");
    user1.setLevel(Level.GOLD);
    user1.setLogin(1557);
    user1.setRecommend(36);
    dao.update(user1);

    User user1update = dao.get(user1.getId());
    checkSameUser(user1, user1update);
}
