#include <iostream>
#include <string>

bool CyclicShift (const std::string& S, const std::string& T){
    if (S.length() != T.length()){
        return false;
    }
    std::string Doubled = S + S;
    return Doubled.find(T) != std::string::npos;
}

int main(){
    std::string S, T;

    std::cout << "S: " << std::endl;
    std::cin >> S;
    
    std::cout << "T: " << std::endl;
    std::cin >> T;

    if (CyclicShift(S, T)){
        std::cout << ("Yes\n");
    } else {
        std::cout << ("No\n");
    }
    return 0;
}