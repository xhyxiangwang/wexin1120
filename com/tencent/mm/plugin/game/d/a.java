package com.tencent.mm.plugin.game.d;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.ui.GameRegionPreference.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a
{
  private Map<String, GameRegionPreference.a> mPd;
  public boolean mRk;
  
  public a()
  {
    GMTrace.i(12569087574016L, 93647);
    this.mRk = false;
    GMTrace.o(12569087574016L, 93647);
  }
  
  public final void aFL()
  {
    try
    {
      GMTrace.i(12569356009472L, 93649);
      if (this.mPd != null)
      {
        Iterator localIterator = this.mPd.values().iterator();
        while (localIterator.hasNext()) {
          ((GameRegionPreference.a)localIterator.next()).mPc = false;
        }
      }
      GMTrace.o(12569356009472L, 93649);
    }
    finally {}
  }
  
  public final void aFM()
  {
    Object localObject6;
    for (;;)
    {
      Object localObject1;
      InputStream localInputStream;
      Object localObject9;
      try
      {
        GMTrace.i(12569490227200L, 93650);
        if (this.mPd == null) {
          this.mPd = new LinkedHashMap();
        }
        if (this.mPd.size() > 0) {
          break label589;
        }
        localObject6 = null;
        localObject1 = null;
      }
      finally {}
      try
      {
        localInputStream = ab.getContext().getAssets().open("game_region_data.txt");
        localObject1 = localInputStream;
        localObject6 = localInputStream;
        localObject9 = new byte[localInputStream.available()];
        localObject1 = localInputStream;
        localObject6 = localInputStream;
        localInputStream.read((byte[])localObject9);
        localObject1 = localInputStream;
        localObject6 = localInputStream;
        localObject9 = new String((byte[])localObject9);
        localObject1 = localObject9;
        if (localInputStream == null) {}
      }
      catch (IOException localIOException4)
      {
        localObject6 = localObject3;
        w.e("MicroMsg.GameCacheUtil", "exception:%s", new Object[] { bg.f(localIOException4) });
        if (localObject3 == null) {
          break label600;
        }
        try
        {
          ((InputStream)localObject3).close();
          str1 = "";
        }
        catch (IOException localIOException2)
        {
          w.e("MicroMsg.GameCacheUtil", "exception:%s", new Object[] { bg.f(localIOException2) });
          str2 = "";
        }
        continue;
      }
      finally
      {
        if (localObject6 == null) {
          break label276;
        }
        try
        {
          ((InputStream)localObject6).close();
          throw ((Throwable)localObject4);
        }
        catch (IOException localIOException3)
        {
          for (;;)
          {
            w.e("MicroMsg.GameCacheUtil", "exception:%s", new Object[] { bg.f(localIOException3) });
          }
        }
        localObject8 = new GameRegionPreference.a();
        ((GameRegionPreference.a)localObject8).mOZ = localIOException3[0];
        ((GameRegionPreference.a)localObject8).mPa = localIOException3[1];
        ((GameRegionPreference.a)localObject8).mPb = localIOException3[2];
        ((GameRegionPreference.a)localObject8).gcc = localIOException3[3];
        ((GameRegionPreference.a)localObject8).mPc = false;
        ((GameRegionPreference.a)localObject8).isDefault = false;
        this.mPd.put(((GameRegionPreference.a)localObject8).gcc, localObject8);
        break label606;
      }
      try
      {
        localInputStream.close();
        localObject1 = localObject9;
      }
      catch (IOException localIOException1)
      {
        w.e("MicroMsg.GameCacheUtil", "exception:%s", new Object[] { bg.f(localIOException1) });
        localObject2 = localObject9;
      }
    }
    localObject1 = ((String)localObject1).trim().split("\n|\r\n|\r");
    int i = 0;
    for (;;)
    {
      if (i < localObject1.length)
      {
        localObject6 = localObject1[i].trim().split("\\|");
        if (localObject6.length < 4)
        {
          w.e("MicroMsg.GameCacheUtil", "this GameRegion item has problem %s", new Object[] { localObject1[i] });
          break label606;
        }
      }
      Object localObject2;
      String str1;
      String str2;
      label276:
      Object localObject8;
      Object localObject5 = e.aEf();
      localObject5 = (GameRegionPreference.a)this.mPd.get(localObject5);
      if (localObject5 != null)
      {
        Object localObject7 = e.aEf();
        localObject7 = (GameRegionPreference.a)a.mRl.aFN().get(localObject7);
        localObject8 = new StringBuffer();
        if (localObject7 != null)
        {
          ((StringBuffer)localObject8).append(((GameRegionPreference.a)localObject7).mOZ);
          ((StringBuffer)localObject8).append(e.zb("zh_CN"));
        }
        ((GameRegionPreference.a)localObject5).mOZ = ((StringBuffer)localObject8).toString();
        localObject7 = e.aEf();
        localObject7 = (GameRegionPreference.a)a.mRl.aFN().get(localObject7);
        localObject8 = new StringBuffer();
        if (localObject7 != null)
        {
          ((StringBuffer)localObject8).append(((GameRegionPreference.a)localObject7).mPa);
          ((StringBuffer)localObject8).append(e.zb("zh_TW"));
        }
        ((GameRegionPreference.a)localObject5).mPa = ((StringBuffer)localObject8).toString();
        localObject7 = e.aEf();
        localObject7 = (GameRegionPreference.a)a.mRl.aFN().get(localObject7);
        localObject8 = new StringBuffer();
        if (localObject7 != null)
        {
          ((StringBuffer)localObject8).append(((GameRegionPreference.a)localObject7).mPb);
          ((StringBuffer)localObject8).append(e.zb("en"));
        }
        ((GameRegionPreference.a)localObject5).mPb = ((StringBuffer)localObject8).toString();
        ((GameRegionPreference.a)localObject5).isDefault = true;
      }
      label589:
      GMTrace.o(12569490227200L, 93650);
      return;
      label600:
      localObject5 = "";
      break;
      label606:
      i += 1;
    }
  }
  
  public final Map<String, GameRegionPreference.a> aFN()
  {
    try
    {
      GMTrace.i(12569624444928L, 93651);
      aFM();
      Map localMap = this.mPd;
      GMTrace.o(12569624444928L, 93651);
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void clearCache()
  {
    try
    {
      GMTrace.i(12569221791744L, 93648);
      if (this.mPd != null) {
        this.mPd.clear();
      }
      this.mRk = false;
      GMTrace.o(12569221791744L, 93648);
      return;
    }
    finally {}
  }
  
  private static final class a
  {
    public static a mRl;
    
    static
    {
      GMTrace.i(12573248323584L, 93678);
      mRl = new a();
      GMTrace.o(12573248323584L, 93678);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */