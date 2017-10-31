package com.tencent.mm.plugin.chatroom.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Iterator;

public final class c
  extends TouchDelegate
{
  private static final Rect kIe;
  ArrayList<TouchDelegate> kIf;
  TouchDelegate kIg;
  
  static
  {
    GMTrace.i(9071105146880L, 67585);
    kIe = new Rect();
    GMTrace.o(9071105146880L, 67585);
  }
  
  public c(View paramView)
  {
    super(kIe, paramView);
    GMTrace.i(9070836711424L, 67583);
    GMTrace.o(9070836711424L, 67583);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(9070970929152L, 67584);
    Object localObject;
    switch (paramMotionEvent.getAction())
    {
    default: 
      localObject = null;
    }
    for (;;)
    {
      if (localObject != null) {
        break label151;
      }
      GMTrace.o(9070970929152L, 67584);
      return false;
      if (this.kIf == null) {
        break;
      }
      localObject = this.kIf.iterator();
      while (((Iterator)localObject).hasNext())
      {
        TouchDelegate localTouchDelegate = (TouchDelegate)((Iterator)localObject).next();
        if ((localTouchDelegate != null) && (localTouchDelegate.onTouchEvent(paramMotionEvent)))
        {
          this.kIg = localTouchDelegate;
          GMTrace.o(9070970929152L, 67584);
          return true;
        }
      }
      localObject = null;
      continue;
      localObject = this.kIg;
      continue;
      localObject = this.kIg;
      this.kIg = null;
    }
    label151:
    boolean bool = ((TouchDelegate)localObject).onTouchEvent(paramMotionEvent);
    GMTrace.o(9070970929152L, 67584);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */