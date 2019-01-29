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

package com.recordins.recordin;

import com.recordins.recordin.orm.BlockchainObject;
import com.recordins.recordin.orm.exception.ORMException;
import org.ethereum.core.Transaction;

public class PendingTransactionInformation {


    public Transaction transaction;
    public Long blockID;
    public String uid;
    public BlockchainObject object;
    public ORMException exception;

    private PendingTransactionInformation() {

    }

    public PendingTransactionInformation(Transaction transaction) {
        this.transaction = transaction;
    }

}
