/*
 *
 *  * Copyright 2012-2015 Viant.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License. You may obtain a copy of
 *  * the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations under
 *  * the License.
 *
 */package com.sm.store;

import voldemort.store.cachestore.StoreException;

public enum PackType {
    Paras ((byte) 0),  ParaList ((byte) 1), ClientPacks ((byte) 2) ;

    final byte value;

    PackType(byte value) {
        this.value = value;
    }

    public static PackType getPackType(byte value) {
        switch ( value) {
            case 0 : return Paras;
            case 1 : return ParaList;
            case 2 : return ClientPacks;
            default : throw new StoreException("wrong op type value "+ value);
        }
    }
}
