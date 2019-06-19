#include <iostream>
#include <string>
using namespace std;

class Test{
    public: 
    int i =10;
    //std::string j ="Why initialization working like java?";
    string j ="Why initialization working like java?";
    

};
main(){
    Test t;
    //std::cout << t.i << std::endl; 
    cout << t.i << endl; 
    //std::cout << t.j << std::endl;  
    cout << t.j << endl;   
}
