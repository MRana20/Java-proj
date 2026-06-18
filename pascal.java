// the reason for this upload is that it beat 93.99% in tc and 92.84% in sc
public List<List<Integer>> generate(int numRows) {
    // given i we want the first ith rows of pascal's triangle
    List<List<Integer>> output= new ArrayList<>();
    List<Integer> init=new ArrayList<>(List.of(1));
    List<Integer> second=new ArrayList<>(List.of(1,1));
    output.add(init);
    if (numRows==1){
        return output;
    }
    output.add(second);
    if (numRows==2){
        return output;
    }
    for (int i=0;i<numRows-2;i++){
        List<Integer> newRow= new ArrayList<>();
        newRow.add(1);
        List<Integer> prev=output.get(output.size()-1);
        int size1=prev.size();
        for(int j =0;j<size1-1;j++){
            newRow.add(prev.get(j)+prev.get(j+1));
        }
        newRow.add(1);
        output.add(newRow);
    }
    return output;
}
