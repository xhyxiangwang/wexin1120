package com.tencent.pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class MultiTalkGroup
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroup> CREATOR = new Parcelable.Creator() {};
  public int xnh;
  public String xri = "";
  public String xrj = "";
  public String xrk = "";
  public String xrl = "";
  public List<MultiTalkGroupMember> xrm = new ArrayList();
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "MultiTalkGroup [mMultiTalkGroupId=" + this.xri + ", mMultiTalkClientGroupId=" + this.xrj + ", mWxGroupId=" + this.xrk + ", mRouteId=" + this.xnh + ", mCreatorUsrName=" + this.xrl + ", mMultiTalkGroupMemberList=" + this.xrm + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = 0;
    String str;
    if (this.xri == null)
    {
      str = "";
      paramParcel.writeString(str);
      if (this.xrj != null) {
        break label136;
      }
      str = "";
      label31:
      paramParcel.writeString(str);
      if (this.xrk != null) {
        break label145;
      }
      str = "";
      label48:
      paramParcel.writeString(str);
      paramParcel.writeInt(this.xnh);
      if (this.xrl != null) {
        break label154;
      }
      str = "";
      label73:
      paramParcel.writeString(str);
      if (this.xrm != null) {
        break label163;
      }
    }
    label136:
    label145:
    label154:
    label163:
    for (int i = 0;; i = this.xrm.size())
    {
      paramParcel.writeInt(i);
      while (j < i)
      {
        paramParcel.writeParcelable((MultiTalkGroupMember)this.xrm.get(j), paramInt);
        j += 1;
      }
      str = this.xri;
      break;
      str = this.xrj;
      break label31;
      str = this.xrk;
      break label48;
      str = this.xrl;
      break label73;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/talkroom/sdk/MultiTalkGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */