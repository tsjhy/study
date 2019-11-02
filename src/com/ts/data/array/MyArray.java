package com.ts.data.array;

/**
 * 模拟数组的增删改查
 */
public class MyArray {
    private int[] data;//存放数组对象
    private  int length;//数组长度
    private int index;//当前已存放数据大小

    public MyArray(int num){
        this.data = new int[num];
        this.length = num;
        this.index = 0;
    }

    /**
     *  数组指定下标插入数据,时间复杂度O(n)
     * @param v 插入数据
     * @param loc 插入的下标
     */
    public void insert(int v,int loc){
        //0,1,2,3,4; length=5,loc = 2;
        if(index++ <length){//数组没有越界
            for(int i=length-1;i>loc;i--){//将数组下标loc后的元素统一向后移动一位
                data[i] = data[i-1];
            }
            data[loc] = v;

        }else{//数组出现越界，需要扩容
            newInt();
            for(int i=length-1;i>loc;i--){//将数组下标loc后的元素统一向后移动一位
                data[i] = data[i-1];
            }
            data[loc] = v;
        }
    }

    /**
     * 扩容方法
     */
    private void newInt(){
        length = 2*length;
        int[] temp = new int[length];
        for(int i=0;i<length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    /**
     * 删除指定数组元素，时间复杂度O(n)
     * @param loc 删除数组元素的下标
     */
    public void delete(int loc){
        for(int i=loc;i<length;i++){
            if(i != length-1){//删除元素不是最后一个元素
                data[loc] = data[loc+1];
            }else{
                data[loc] = 0;//置为0代表该位置没有存数据
            }
        }
        index--;
    }

    /**
     * 更新数组元素,时间复杂度O(1)
     * @param v 更新的值
     * @param loc 数组元素下标
     */
    public void update(int v,int loc){
        data[loc] = v;
    }

    /**
     *  取指定数组下标的元素,时间复杂度O(1)
     * @param loc 要获取数组元素的下标
     * @return 数组元素
     */
    public int get(int loc){
        return data[loc];
    }

}
