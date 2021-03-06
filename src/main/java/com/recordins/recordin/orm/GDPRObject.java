/*
 * Record'in
 *
 * Copyright (C) 2019 Blockchain Record'in Solutions
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.recordins.recordin.orm;

import com.recordins.recordin.orm.attribute.*;
import com.recordins.recordin.orm.attribute.AttrAttachment;
import com.recordins.recordin.orm.attribute.AttrString;
import com.recordins.recordin.orm.exception.ORMException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GDPRObject extends BlockchainObject {

    /* Logger for console output */
    private static Logger logger = LoggerFactory.getLogger(GDPRObject.class);

    private AttrAttachment attachment = new AttrAttachment();

    public GDPRObject() throws ORMException {
        super();

        setModel(this.getClass().getSimpleName());
    }


    public AttrAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(AttrAttachment attachment) {
        this.attachment = attachment;
    }
}
