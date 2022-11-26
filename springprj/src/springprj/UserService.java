package springprj;

import java.util.List;

public class UserService {
    public void upgradeLevels() {
        List<User> users = userDao.getAll();
        for (User user : users) {
                        boolean isChanged = false;
            if (user.getLevel() == Level.BASIC && user.getLogin() >= 50) {
                user.setLevel(Level.SILVER);
                isChanged = true; // 조건에 부합하여 유저 등급이 바뀌어야 함
            } else if (user.getLevel() == Level.SILVER && user.getRecommend() >= 30) {
                user.setLevel(Level.GOLD);
                isChanged = true;
            }
                        if(isChanged){ userDao.update(user); } // 등급 바뀔 시 업데이트 적용
        }
    }
}
