package com.tencent.pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MultiTalkGroupMember
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupMember> CREATOR = new Parcelable.Creator() {};
  public int fFs;
  public int status;
  public int xqm;
  public String xrn = "";
  public String xro = "";
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "MultiTalkGroupMember [usrName=" + this.xrn + ", inviteUsrName=" + this.xro + ", status=" + this.status + ", reason=" + this.fFs + ", inviteTime=" + this.xqm + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.xrn == null)
    {
      str = "";
      paramParcel.writeString(str);
      if (this.xro != null) {
        break label63;
      }
    }
    label63:
    for (String str = "";; str = this.xro)
    {
      paramParcel.writeString(str);
      paramParcel.writeInt(this.status);
      paramParcel.writeInt(this.fFs);
      paramParcel.writeInt(this.xqm);
      return;
      str = this.xrn;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/talkroom/sdk/MultiTalkGroupMember.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */