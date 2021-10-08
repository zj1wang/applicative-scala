#变量
your_name="qinjx"
echo $your_name
echo ${#your_name}
readonly your_name
list=(1 2 3 4)
echo ${list[1]}
echo "Shell 传递参数实例！";
echo "执行的文件名：$0";
echo "第一个参数为：$1";
echo "第二个参数为：$2";
echo "第三个参数为：$3";
a=30
b=30

if [[ $a = $b && $a = 30 ]]
then
   echo "返回 true"
else
   echo "返回 false"
   fi
echo -e "OK! \n"
echo "OK! \n"




int=1
while(( $int<=5 ))
do
    echo $int
    let "int++"
done

