package vccord.primenumber.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumberService {
    public List<Integer> findPrimeNumbers(Integer number) {
        List<Integer> listPrimeNumbers = new ArrayList<>();
        for (int i = 0; i < number ; i++) {
            if(checkPrimeNumber(i)){
                listPrimeNumbers.add(i);
            }
        }
        return listPrimeNumbers;
    }

    public boolean checkPrimeNumber(Integer n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
