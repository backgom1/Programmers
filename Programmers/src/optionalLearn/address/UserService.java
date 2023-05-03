package optionalLearn.address;

import java.util.Optional;

public class UserService {
    public void printUserNameIfAddressIsInSeoul(User user) {
        user.getName();
        Optional.ofNullable(user)
                .map(User::getAddress)
                .filter(address -> "Seoul".equals(address.getCity()))
                .ifPresent(address -> System.out.println(user.getName()));
    }
}
