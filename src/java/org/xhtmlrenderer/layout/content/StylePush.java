/*
 * StylePush.java
 * Copyright (c) 2004 Torbj�rn Gannholm
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 */
package org.xhtmlrenderer.layout.content;

import org.w3c.dom.Element;
import org.xhtmlrenderer.css.newmatch.CascadedStyle;

/**
 * A marker for changing the style of the first letter
 */
public class StylePush {
    private CascadedStyle _style;
    private Element _elem;//needed for dynamic stuff

    StylePush(CascadedStyle style, Element e) {
        _style = style;
        _elem = e;
    }

    public CascadedStyle getStyle() {
        return _style;
    }

    public Element getElement() {
        return _elem;
    }
}
