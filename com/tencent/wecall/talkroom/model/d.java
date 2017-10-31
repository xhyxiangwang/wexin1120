package com.tencent.wecall.talkroom.model;

import com.tencent.pb.b.a.a;
import com.tencent.pb.common.b.a.a.as;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.h;

public final class d
{
  private String qQo;
  a.as xLO;
  private a.at xLP;
  
  public d(a.as paramas)
  {
    a(paramas);
  }
  
  public d(a.as paramas, a.at paramat)
  {
    a(paramas);
    if (paramat == null)
    {
      c.k("tagorewang:TalkRoomMember", new Object[] { "set null profile" });
      return;
    }
    this.xLP = paramat;
  }
  
  public final void a(a.as paramas)
  {
    if (paramas == null)
    {
      c.k("tagorewang:TalkRoomMember", new Object[] { "set null info" });
      return;
    }
    this.xLO = paramas;
  }
  
  public final String cob()
  {
    if (this.xLO != null) {
      return this.xLO.xps;
    }
    return "";
  }
  
  public final int coc()
  {
    if (this.xLO == null) {
      return -1;
    }
    return this.xLO.mXM;
  }
  
  public final boolean cod()
  {
    return h.equals(a.cjV(), cob());
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof d))) {
      return false;
    }
    return h.equals(cob(), ((d)paramObject).cob());
  }
  
  public final String getDisplayName()
  {
    try
    {
      localObject2 = this.qQo;
      if ((localObject2 == null) || (((String)localObject2).trim().length() == 0)) {
        break label157;
      }
      localObject1 = ((String)localObject2).trim().toCharArray();
      j = 0;
      i = 0;
      if (j >= localObject1.length) {
        break label174;
      }
      if (localObject1[j] < '¡') {
        break label167;
      }
      i += 2;
    }
    catch (Exception localException)
    {
      Object localObject1;
      label60:
      label73:
      c.k("tagorewang:TalkRoomMember", new Object[] { "getDisplayName err: ", localException });
      return this.qQo;
    }
    Object localObject2 = new StringBuilder();
    int i = 0;
    int j = 0;
    if (j < localObject1.length)
    {
      if (localObject1[j] < '¡') {
        break label183;
      }
      i += 2;
    }
    for (;;)
    {
      if (i + 1 <= 10)
      {
        ((StringBuilder)localObject2).append(localObject1[j]);
        j += 1;
        break label73;
      }
      ((StringBuilder)localObject2).append('…');
      localObject1 = ((StringBuilder)localObject2).toString();
      return (String)localObject1;
      label157:
      return (String)localObject2;
      for (;;)
      {
        j += 1;
        break;
        label167:
        i += 1;
      }
      label174:
      if (i > 10) {
        break label60;
      }
      return (String)localObject2;
      label183:
      i += 1;
    }
  }
  
  public final int getState()
  {
    if (this.xLO == null) {
      return 0;
    }
    return this.xLO.status;
  }
  
  public final int hashCode()
  {
    String str = cob();
    if (str == null) {
      return 0;
    }
    return str.hashCode();
  }
  
  public final String toString()
  {
    int i = 0;
    if (this.xLO != null) {
      i = this.xLO.trb;
    }
    while ((this.xLO == null) || (this.xLP == null))
    {
      return "invlaid TalkRoomMember which uuid is " + i;
      if (this.xLP != null) {
        i = this.xLP.trb;
      }
    }
    StringBuilder localStringBuilder1 = new StringBuilder();
    Object localObject = this.xLO;
    StringBuilder localStringBuilder2;
    if (localObject == null)
    {
      localObject = "null";
      localStringBuilder2 = localStringBuilder1.append((String)localObject).append(" ");
      localObject = this.xLP;
      if (localObject != null) {
        break label238;
      }
    }
    label238:
    StringBuilder localStringBuilder3;
    for (localObject = "null";; localObject = localStringBuilder3.toString())
    {
      localStringBuilder2.append((String)localObject);
      return localStringBuilder1.toString();
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("VoiceGroupMem");
      localStringBuilder2.append(" uuid:").append(((a.as)localObject).trb);
      localStringBuilder2.append(" openClientId:").append(((a.as)localObject).xqp);
      localStringBuilder2.append(" invite uuid: ").append(((a.as)localObject).xql);
      localStringBuilder2.append(" member id:").append(((a.as)localObject).mXM);
      localStringBuilder2.append(" status: ").append(((a.as)localObject).status);
      localStringBuilder2.append(" reason: ").append(((a.as)localObject).fFs);
      localObject = localStringBuilder2.toString();
      break;
      localStringBuilder3 = new StringBuilder();
      localStringBuilder3.append("VoiceGroupUsrProfile");
      localStringBuilder3.append(" uuid: ").append(((a.at)localObject).trb);
      localStringBuilder3.append(" user name: ").append(((a.at)localObject).username);
      localStringBuilder3.append(" head url: ").append(((a.at)localObject).oRV);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */