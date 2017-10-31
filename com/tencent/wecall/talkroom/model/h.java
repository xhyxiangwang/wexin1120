package com.tencent.wecall.talkroom.model;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.pb.common.c.d;
import com.tencent.pb.common.c.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class h
{
  static final String TAG = h.class.getCanonicalName();
  public static h xNw = new h();
  String deviceModel;
  public String groupId = "";
  public int mXM = -1;
  public int mXg = 0;
  public long mXh = 0L;
  long mYC = 0L;
  int mYD = 0;
  public int netType = -1;
  String rAd = "";
  public int rrV = 1;
  public int rsc = 0;
  public int rsj = -1;
  int rzK = 0;
  int rzN = 0;
  int rzR = 0;
  long rzS = 0L;
  int rzX = 0;
  public int rzY = 0;
  long xNA = 0L;
  int xNB = 0;
  public int xNC = 0;
  int xND = 0;
  long xNE = 0L;
  int xNF;
  int xNG = -1;
  String xNH;
  int xNI;
  StringBuffer xNJ = new StringBuffer();
  long xNK = 0L;
  long xNL = 0L;
  long xNM = 0L;
  public int xNx = 0;
  int xNy = 0;
  long xNz = 0L;
  public String xnN = "";
  
  public static void FC(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendNetSceneStat", Integer.valueOf(paramInt) });
    g.z(527, 3, String.valueOf(paramInt));
  }
  
  public static void FD(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendDeviceStat", Integer.valueOf(paramInt) });
    g.z(528, 3, String.valueOf(paramInt));
  }
  
  public static void FE(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendtalkRoomDialStat", Integer.valueOf(paramInt) });
    g.z(530, 3, String.valueOf(paramInt));
  }
  
  public static void FF(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineStat", Integer.valueOf(paramInt) });
    g.z(529, 3, String.valueOf(paramInt));
  }
  
  public static void Ye(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendSummaryNetScene", paramString });
    g.z(532, 3, paramString);
  }
  
  public static void Yf(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineRecv", paramString });
    g.z(533, 3, paramString);
  }
  
  public static void Yg(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineSend", paramString });
    g.z(534, 3, paramString);
  }
  
  public static void Yh(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendChannelStat", paramString });
    g.z(535, 3, paramString);
  }
  
  public static void a(int paramInt, long paramLong, String... paramVarArgs)
  {
    h localh = new h();
    localh.groupId = "";
    localh.mXg = paramInt;
    localh.mXh = paramLong;
    localh.xnN = "";
    localh.N(paramVarArgs);
    Ye(localh.cos());
    g.cjU();
  }
  
  public static void a(String paramString, int paramInt, long paramLong, String... paramVarArgs)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k(TAG, new Object[] { "uploadTempReport groupId is null" });
      return;
    }
    com.tencent.pb.common.c.c.k(TAG, new Object[] { "uploadTempReport: ", paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    h localh = new h();
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    localh.groupId = str;
    localh.mXg = paramInt;
    localh.mXh = paramLong;
    localh.N(paramVarArgs);
    Ye(localh.cos());
  }
  
  public static void a(String paramString1, String paramString2, int paramInt, long paramLong, String... paramVarArgs)
  {
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      com.tencent.pb.common.c.c.k(TAG, new Object[] { "uploadTempReport groupId and clientGroupId is null" });
      return;
    }
    com.tencent.pb.common.c.c.k(TAG, new Object[] { "uploadTempReport: ", paramString1, " clientGroupId: ", paramString2, " roomid: ", Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    h localh = new h();
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    localh.groupId = str;
    localh.mXg = paramInt;
    localh.mXh = paramLong;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    localh.xnN = paramString1;
    localh.N(paramVarArgs);
    Ye(localh.cos());
    g.cjU();
  }
  
  public static void cov()
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendTalkRoomOnDialStat", Integer.valueOf(60535) });
    g.z(531, 3, "-5001");
  }
  
  public final void FG(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "stopStatus", Integer.valueOf(paramInt) });
    this.rzK = paramInt;
  }
  
  public final void N(String... paramVarArgs)
  {
    int i = 0;
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {}
    for (;;)
    {
      return;
      if (this.xNJ.length() > 900)
      {
        this.xNJ.setLength(0);
        this.xNJ.append("overmaxsize");
      }
      if (this.xNJ.length() != 0) {
        this.xNJ.append("-");
      }
      int j = paramVarArgs.length;
      while (i < j)
      {
        String str = paramVarArgs[i];
        this.xNJ.append(str);
        this.xNJ.append("|");
        i += 1;
      }
    }
  }
  
  public final String cos()
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "collectInfo" });
    this.xNH = Build.MANUFACTURER;
    this.deviceModel = Build.MODEL;
    this.xNI = Build.VERSION.SDK_INT;
    this.rAd = Build.VERSION.RELEASE;
    this.netType = k.il(d.rwf);
    this.rzX = 0;
    this.rzY = 0;
    this.xNF = -1;
    this.xNG = -1;
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(this.groupId);
    ((List)localObject1).add(this.xnN);
    ((List)localObject1).add(Integer.valueOf(this.rrV));
    ((List)localObject1).add(Integer.valueOf(this.mXg));
    ((List)localObject1).add(Long.valueOf(this.mXh));
    ((List)localObject1).add(Integer.valueOf(this.mXM));
    ((List)localObject1).add(Integer.valueOf(this.rzK));
    ((List)localObject1).add(Integer.valueOf(this.rzR));
    ((List)localObject1).add(Integer.valueOf(this.rzN));
    ((List)localObject1).add(Integer.valueOf(this.mYD));
    ((List)localObject1).add(Integer.valueOf(this.xNx));
    ((List)localObject1).add(Integer.valueOf(this.xNy));
    ((List)localObject1).add(Long.valueOf(this.xNz));
    ((List)localObject1).add(Long.valueOf(this.xNA));
    ((List)localObject1).add(Integer.valueOf(this.xNB));
    ((List)localObject1).add(Integer.valueOf(this.xNC));
    ((List)localObject1).add(Integer.valueOf(this.xND));
    ((List)localObject1).add(Long.valueOf(this.xNE));
    ((List)localObject1).add(Long.valueOf(this.rzS));
    ((List)localObject1).add(Long.valueOf(this.mYC));
    ((List)localObject1).add(Integer.valueOf(this.rzX));
    ((List)localObject1).add(Integer.valueOf(this.rzY));
    ((List)localObject1).add(Integer.valueOf(this.netType));
    ((List)localObject1).add(Integer.valueOf(this.xNF));
    ((List)localObject1).add(Integer.valueOf(this.xNG));
    ((List)localObject1).add(this.xNH);
    ((List)localObject1).add(this.deviceModel);
    ((List)localObject1).add(Integer.valueOf(this.xNI));
    ((List)localObject1).add(this.rAd);
    Object localObject2 = c.cnZ();
    String str = this.groupId;
    localObject2 = ((c)localObject2).XW(str);
    int i;
    if (localObject2 == null) {
      i = 0;
    }
    for (;;)
    {
      ((List)localObject1).add(Integer.valueOf(i));
      ((List)localObject1).add(this.xNJ.toString());
      ((List)localObject1).add(Integer.valueOf(this.rsj));
      ((List)localObject1).add(Integer.valueOf(this.rsc));
      localObject1 = com.tencent.pb.common.c.h.a((Iterable)localObject1, ",", "_");
      com.tencent.pb.common.c.c.d(TAG, new Object[] { "logBuf: ", this.xNJ.toString() });
      com.tencent.pb.common.c.c.d(TAG, new Object[] { "statresult", localObject1 });
      return (String)localObject1;
      i = ((TalkRoom)localObject2).xLH.size();
      com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getGroupMemberSize groupid: ", str, " size: ", Integer.valueOf(i) });
    }
  }
  
  public final void cot()
  {
    this.xNK = System.currentTimeMillis();
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "beginCreateOrEnter", Long.valueOf(this.xNK) });
  }
  
  public final void cou()
  {
    com.tencent.pb.common.c.c.k(TAG, new Object[] { "beginCreateOrNotify" });
    this.xNL = System.currentTimeMillis();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */