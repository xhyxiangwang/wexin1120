package com.tencent.wecall.talkroom.model;

import android.os.Handler;
import android.os.Looper;
import com.tencent.pb.common.b.a.a.aj;
import com.tencent.pb.common.c.i;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
{
  public List<a> gBe = new LinkedList();
  Handler handler = new Handler(Looper.getMainLooper());
  
  public final void a(final int paramInt, final MultiTalkGroup paramMultiTalkGroup)
  {
    paramMultiTalkGroup = new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.gBe)
        {
          Iterator localIterator = g.this.gBe.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).a(paramInt, paramMultiTalkGroup);
          }
        }
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramMultiTalkGroup.run();
      return;
    }
    this.handler.post(paramMultiTalkGroup);
  }
  
  public final void de(final List<MultiTalkGroup> paramList)
  {
    paramList = new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.gBe)
        {
          Iterator localIterator = g.this.gBe.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).de(paramList);
          }
        }
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramList.run();
      return;
    }
    this.handler.post(paramList);
  }
  
  public final void ds(final String paramString, final int paramInt)
  {
    i.ab(new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.gBe)
        {
          Iterator localIterator = g.this.gBe.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).ds(paramString, paramInt);
          }
        }
      }
    });
  }
  
  public final void e(final int paramInt, final Object paramObject)
  {
    paramObject = new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.gBe)
        {
          Iterator localIterator = g.this.gBe.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).e(paramInt, paramObject);
          }
        }
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      ((Runnable)paramObject).run();
      return;
    }
    this.handler.post((Runnable)paramObject);
  }
  
  public final void g(final MultiTalkGroup paramMultiTalkGroup)
  {
    paramMultiTalkGroup = new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.gBe)
        {
          Iterator localIterator = g.this.gBe.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).g(paramMultiTalkGroup);
          }
        }
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramMultiTalkGroup.run();
      return;
    }
    this.handler.post(paramMultiTalkGroup);
  }
  
  public static abstract interface a
  {
    public abstract void FA(int paramInt);
    
    public abstract void Fz(int paramInt);
    
    public abstract void a(int paramInt, MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void aJU();
    
    public abstract void aT(List<a.aj> paramList);
    
    public abstract void b(MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void bj(String paramString, boolean paramBoolean);
    
    public abstract void cof();
    
    public abstract void cog();
    
    public abstract void coh();
    
    public abstract void de(List<MultiTalkGroup> paramList);
    
    public abstract void ds(String paramString, int paramInt);
    
    public abstract void e(int paramInt, Object paramObject);
    
    public abstract void g(MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void gg(boolean paramBoolean);
    
    public abstract void onStateChanged(int paramInt);
    
    public abstract void p(MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void q(MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void y(String paramString, byte[] paramArrayOfByte);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */