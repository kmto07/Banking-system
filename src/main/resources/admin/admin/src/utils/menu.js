const menu = {
    list() {
        return [
            {
                "backMenu": [
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-wenzi",
                                "buttons": ["查看", "修改", "删除"],
                                "menu": "通知信息",
                                "menuJump": "列表",
                                "tableName": "tongzhixinxi"
                            }
                        ],
                        "menu": "通知信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-phone",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "用户",
                                "menuJump": "列表",
                                "tableName": "yonghu"
                            }
                        ],
                        "menu": "用户管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-flashlightopen",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "银行",
                                "menuJump": "列表",
                                "tableName": "yinxing"
                            }
                        ],
                        "menu": "银行管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-attentionfavor",
                                "buttons": ["查看", "修改", "删除"],
                                "menu": "卡号账户",
                                "menuJump": "列表",
                                "tableName": "kahaozhanghu"
                            }
                        ],
                        "menu": "卡号账户管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-cardboard",
                                "buttons": ["查看", "修改", "删除"],
                                "menu": "存款信息",
                                "menuJump": "列表",
                                "tableName": "cunkuanxinxi"
                            }
                        ],
                        "menu": "存款信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-discover",
                                "buttons": ["查看", "修改", "删除"],
                                "menu": "取款信息",
                                "menuJump": "列表",
                                "tableName": "qukuanxinxi"
                            }
                        ],
                        "menu": "取款信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-shop",
                                "buttons": ["查看", "修改", "删除"],
                                "menu": "转账信息",
                                "menuJump": "列表",
                                "tableName": "zhuanzhangxinxi"
                            }
                        ],
                        "menu": "转账信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-flashlightopen",
                                "buttons": ["查看", "修改", "删除", "审核"],
                                "menu": "客服反馈",
                                "menuJump": "列表",
                                "tableName": "kefufankui"
                            }
                        ],
                        "menu": "客服反馈管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-robot",
                                "buttons": ["查看"],
                                "menu": "AI客服",
                                "menuJump": "列表",
                                "tableName": "aichat"
                            }
                        ],
                        "menu": "智能服务管理" // 建议新增分类
                    }
                ],
                "frontMenu": [],
                "hasBackLogin": "是",
                "hasBackRegister": "否",
                "hasFrontLogin": "否",
                "hasFrontRegister": "否",
                "roleName": "管理员",
                "tableName": "users"
            },
            {
                "backMenu": [
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-wenzi",
                                "buttons": ["查看", "删除"],
                                "menu": "通知信息",
                                "menuJump": "列表",
                                "tableName": "tongzhixinxi"
                            }
                        ],
                        "menu": "通知信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-attentionfavor",
                                "buttons": ["查看", "还款"],
                                "menu": "卡号账户",
                                "menuJump": "列表",
                                "tableName": "kahaozhanghu"
                            }
                        ],
                        "menu": "卡号账户管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-cardboard",
                                "buttons": ["查看"],
                                "menu": "存款信息",
                                "menuJump": "列表",
                                "tableName": "cunkuanxinxi"
                            }
                        ],
                        "menu": "存款信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-discover",
                                "buttons": ["查看"],
                                "menu": "取款信息",
                                "menuJump": "列表",
                                "tableName": "qukuanxinxi"
                            }
                        ],
                        "menu": "取款信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-shop",
                                "buttons": ["查看"],
                                "menu": "转账信息",
                                "menuJump": "列表",
                                "tableName": "zhuanzhangxinxi"
                            }
                        ],
                        "menu": "转账信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-flashlightopen",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "客服反馈",
                                "menuJump": "列表",
                                "tableName": "kefufankui"
                            }
                        ],
                        "menu": "客服反馈管理"
                        
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-robot",
                                "buttons": ["查看"],
                                "menu": "AI客服",
                                "menuJump": "列表",
                                "tableName": "aichat"
                            }
                        ],
                        "menu": "智能服务管理" // 建议新增分类
                    }
                ],
                "frontMenu": [],
                "hasBackLogin": "是",
                "hasBackRegister": "是",
                "hasFrontLogin": "是",
                "hasFrontRegister": "是",
                "roleName": "用户",
                "tableName": "yonghu"
            },
            {
                "backMenu": [
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-wenzi",
                                "buttons": ["查看", "删除"],
                                "menu": "通知信息",
                                "menuJump": "列表",
                                "tableName": "tongzhixinxi"
                            }
                        ],
                        "menu": "通知信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-phone",
                                "buttons": ["查看", "开卡", "通知", "发布账单"],
                                "menu": "用户",
                                "menuJump": "列表",
                                "tableName": "yonghu"
                            }
                        ],
                        "menu": "用户管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-attentionfavor",
                                "buttons": ["查看", "删除", "存款", "取款", "转账", "修改", "放款"],
                                "menu": "卡号账户",
                                "menuJump": "列表",
                                "tableName": "kahaozhanghu"
                            }
                        ],
                        "menu": "卡号账户管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-cardboard",
                                "buttons": ["查看", "删除", "修改"],
                                "menu": "存款信息",
                                "menuJump": "列表",
                                "tableName": "cunkuanxinxi"
                            }
                        ],
                        "menu": "存款信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-discover",
                                "buttons": ["查看", "删除", "修改"],
                                "menu": "取款信息",
                                "menuJump": "列表",
                                "tableName": "qukuanxinxi"
                            }
                        ],
                        "menu": "取款信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-shop",
                                "buttons": ["查看", "删除", "修改"],
                                "menu": "转账信息",
                                "menuJump": "列表",
                                "tableName": "zhuanzhangxinxi"
                            }
                        ],
                        "menu": "转账信息管理"
                    },
                    {
                        "child": [
                            {
                                "appFrontIcon": "cuIcon-robot",
                                "buttons": ["查看"],
                                "menu": "AI客服",
                                "menuJump": "列表",
                                "tableName": "aichat"
                            }
                        ],
                        "menu": "智能服务管理" // 建议新增分类
                    }
                ],
                "frontMenu": [],
                "hasBackLogin": "是",
                "hasBackRegister": "否",
                "hasFrontLogin": "是",
                "hasFrontRegister": "是",
                "roleName": "银行",
                "tableName": "yinxing"
            }
        ];
    }
};

export default menu;