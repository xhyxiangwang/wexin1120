package com.tencent.mm.plugin.sns.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;
import java.util.List;

public class SnsCmdList
  implements Parcelable
{
  public static final Parcelable.Creator<SnsCmdList> CREATOR;
  public int pYg;
  public int pYh;
  public List<Integer> pYi;
  public List<Integer> pYj;
  
  static
  {
    GMTrace.i(8783879208960L, 65445);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(8783879208960L, 65445);
  }
  
  public SnsCmdList()
  {
    GMTrace.i(8782402813952L, 65434);
    this.pYg = 0;
    this.pYh = 0;
    this.pYi = new LinkedList();
    this.pYj = new LinkedList();
    GMTrace.o(8782402813952L, 65434);
  }
  
  public int describeContents()
  {
    GMTrace.i(8782805467136L, 65437);
    GMTrace.o(8782805467136L, 65437);
    return 0;
  }
  
  public final void tP(int paramInt)
  {
    GMTrace.i(8782537031680L, 65435);
    this.pYi.add(Integer.valueOf(paramInt));
    GMTrace.o(8782537031680L, 65435);
  }
  
  public final void tQ(int paramInt)
  {
    GMTrace.i(8782671249408L, 65436);
    this.pYj.add(Integer.valueOf(paramInt));
    GMTrace.o(8782671249408L, 65436);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    GMTrace.i(8782939684864L, 65438);
    this.pYg = this.pYi.size();
    paramParcel.writeInt(this.pYg);
    paramInt = 0;
    while (paramInt < this.pYg)
    {
      paramParcel.writeInt(((Integer)this.pYi.get(paramInt)).intValue());
      paramInt += 1;
    }
    this.pYh = this.pYj.size();
    paramParcel.writeInt(this.pYh);
    paramInt = i;
    while (paramInt < this.pYh)
    {
      paramParcel.writeInt(((Integer)this.pYj.get(paramInt)).intValue());
      paramInt += 1;
    }
    GMTrace.o(8782939684864L, 65438);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/data/SnsCmdList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */