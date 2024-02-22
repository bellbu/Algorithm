function solution(num_list) {
    const leng = num_list.length;
    
    if(num_list[leng-1] > num_list[leng-2]){
        num_list.push(num_list[leng-1] - num_list[leng-2]);
    }else{
        num_list.push(num_list[leng-1]*2);
    }
    
    return num_list;
}
