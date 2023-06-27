"use strict";(self["webpackChunkapp"]=self["webpackChunkapp"]||[]).push([[976],{5976:function(e,t,o){o.r(t),o.d(t,{default:function(){return x}});var r=function(){var e=this,t=e._self._c;return t("div",{staticClass:"room"},[t("div",[t("el-card",{staticClass:"box-card"},[e._v(" 所属小区 "),t("el-select",{attrs:{clearable:"",placeholder:"请选择",size:"mini"},model:{value:e.sreach.rid,callback:function(t){e.$set(e.sreach,"rid",t)},expression:"sreach.rid"}},e._l(e.residenceName,(function(e,o){return t("el-option",{key:o,attrs:{label:e.name,value:e.rid}})})),1),e._v(" 户型 "),t("el-input",{staticStyle:{margin:"0 10px"},attrs:{size:"mini",placeholder:"请输入户型",clearable:""},model:{value:e.sreach.roomType,callback:function(t){e.$set(e.sreach,"roomType",t)},expression:"sreach.roomType"}}),e._v(" 租金范围 "),t("el-form",{ref:"form",staticStyle:{display:"inline-block"},attrs:{model:e.sreach,rules:e.rules}},[t("el-form-item",{staticStyle:{display:"inline-block",margin:"0"},attrs:{prop:"minrentFee"}},[t("el-input",{staticStyle:{width:"100px"},attrs:{size:"mini"},model:{value:e.sreach.minrentFee,callback:function(t){e.$set(e.sreach,"minrentFee",e._n(t))},expression:"sreach.minrentFee"}})],1),e._v(" ~ "),t("el-form-item",{staticStyle:{display:"inline-block",margin:"0"},attrs:{prop:"maxrentFee"}},[t("el-input",{staticStyle:{width:"100px"},attrs:{size:"mini"},model:{value:e.sreach.maxrentFee,callback:function(t){e.$set(e.sreach,"maxrentFee",e._n(t))},expression:"sreach.maxrentFee"}})],1)],1),t("el-button",{staticStyle:{"margin-left":"10px"},attrs:{type:"primary",size:"mini"},on:{click:e.sreachRoom}},[e._v("搜索")])],1)],1),t("el-button",{staticStyle:{"margin-top":"20px"},attrs:{size:"mini",type:"primary",icon:"el-icon-plus"},on:{click:e.addRoom}},[e._v("添加房间")]),t("el-table",{staticStyle:{width:"100%","margin-top":"10px"},attrs:{data:e.roomData,border:!0}},[t("el-table-column",{attrs:{prop:"roomId",label:"编号",width:"60",align:e.center}}),t("el-table-column",{attrs:{label:"所属小区",width:"100",align:e.center},scopedSlots:e._u([{key:"default",fn:function({row:o}){return[t("el-tag",{attrs:{size:"plus"}},[e._v(e._s(o.residence.name))])]}}])}),t("el-table-column",{attrs:{prop:"buildingNo",label:"楼栋名称"}}),t("el-table-column",{attrs:{prop:"unitNo",label:"单元号",width:"100"}}),t("el-table-column",{attrs:{prop:"roomNo",label:"房间号",width:"60"}}),t("el-table-column",{attrs:{prop:"roomType",label:"户型",width:"100"}}),t("el-table-column",{attrs:{prop:"roomDirection",label:"房间朝向"}}),t("el-table-column",{attrs:{label:"禁用"},scopedSlots:e._u([{key:"default",fn:function({row:o}){return[1==o.isOnline?t("el-tag",{attrs:{type:"success"}},[e._v("上线")]):e._e(),0==o.isOnline?t("el-tag",{attrs:{type:"danger"}},[e._v("下线")]):e._e()]}}])}),t("el-table-column",{attrs:{prop:"rentFee",label:"租金",width:"80"}}),t("el-table-column",{attrs:{prop:"propertyFee",label:"物业费",width:"60"}}),t("el-table-column",{attrs:{width:"250",label:"操作"},scopedSlots:e._u([{key:"default",fn:function({row:o}){return[t("HintButton",{attrs:{type:"primary",icon:"el-icon-edit",size:"mini",title:"更新"},on:{click:function(t){return e.updataRommds(o)}}}),t("HintButton",{attrs:{type:"danger",icon:"el-icon-delete",size:"mini",title:"删除"},on:{click:function(t){return e.deleteRoom(o)}}}),1==o.isOnline?t("HintButton",{attrs:{type:"success",icon:"el-icon-bottom",size:"mini",title:"下线"},on:{click:function(t){return e.leftLine(o.roomId)}}}):e._e(),0==o.isOnline?t("HintButton",{attrs:{type:"success",size:"mini",icon:"el-icon-top",title:"上线"},on:{click:function(t){return e.goToline(o.roomId)}}}):e._e()]}}])})],1),t("AddRoom",{ref:"room"})],1)},i=[],a=(o(1703),function(){var e=this,t=e._self._c;return t("a",{staticStyle:{margin:"10px"},attrs:{title:e.title}},[t("el-button",e._g(e._b({},"el-button",e.$attrs,!1),e.$listeners))],1)}),l=[],s={props:["title"],name:"HintButton"},n=s,m=o(1001),c=(0,m.Z)(n,a,l,!1,null,null,null),u=c.exports,d=function(){var e=this,t=e._self._c;return t("div",[t("el-dialog",{attrs:{title:e.room.roomId?"更新房间":"添加房间",visible:e.dialogFormVisible},on:{"update:visible":function(t){e.dialogFormVisible=t}}},[t("el-form",{attrs:{model:e.room,"label-width":"80px"}},[t("el-form-item",{directives:[{name:"show",rawName:"v-show",value:!e.room.roomId,expression:"!room.roomId"}],attrs:{label:"小区选择",width:"10px"}},[t("el-select",{attrs:{clearable:"",placeholder:"请选择"},model:{value:e.room.rid,callback:function(t){e.$set(e.room,"rid",t)},expression:"room.rid"}},e._l(e.seleceResidence,(function(e,o){return t("el-option",{key:o,attrs:{label:e.name,value:e.rid}})})),1)],1),t("el-form-item",{attrs:{label:"整栋名称",width:"10px"}},[t("el-input",{attrs:{placeholder:"请输入楼层名称"},model:{value:e.room.buildingNo,callback:function(t){e.$set(e.room,"buildingNo",t)},expression:"room.buildingNo"}})],1),t("el-form-item",{attrs:{label:"单元号",width:"10%"}},[t("el-input",{attrs:{placeholder:"请输入单元号",autocomplete:"off"},model:{value:e.room.unitNo,callback:function(t){e.$set(e.room,"unitNo",t)},expression:"room.unitNo"}})],1),t("el-form-item",{attrs:{label:"房间号",width:"10%"}},[t("el-input",{attrs:{placeholder:"请输入房间号",autocomplete:"off"},model:{value:e.room.roomNo,callback:function(t){e.$set(e.room,"roomNo",t)},expression:"room.roomNo"}})],1),t("el-form-item",{attrs:{label:"户型",width:"10%"}},[t("el-input",{attrs:{placeholder:"请输入户型",autocomplete:"off"},model:{value:e.room.roomType,callback:function(t){e.$set(e.room,"roomType",t)},expression:"room.roomType"}})],1),t("el-form-item",{attrs:{label:"房间朝向",width:"10%"}},[t("el-input",{attrs:{placeholder:"请输入房间朝向",autocomplete:"off"},model:{value:e.room.roomDirection,callback:function(t){e.$set(e.room,"roomDirection",t)},expression:"room.roomDirection"}})],1),t("el-form-item",{attrs:{label:"租金",width:"10%"}},[t("el-input-number",{attrs:{InputNumber:2,step:.1,placeholder:"请输入租金",autocomplete:"off"},model:{value:e.room.rentFee,callback:function(t){e.$set(e.room,"rentFee",t)},expression:"room.rentFee"}})],1),t("el-form-item",{attrs:{label:"物业费",width:"10%"}},[t("el-input-number",{attrs:{placeholder:"请输入物业费",InputNumber:2,step:.1,autocomplete:"off"},model:{value:e.room.propertyFee,callback:function(t){e.$set(e.room,"propertyFee",t)},expression:"room.propertyFee"}})],1)],1),t("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[t("el-button",{on:{click:function(t){e.dialogFormVisible=!1}}},[e._v("取 消")]),t("el-button",{attrs:{type:"primary"},on:{click:e.saveRoomData}},[e._v("确 定")])],1)],1)],1)},p=[],h={name:"AddRoom",data(){return{room:{buildingNo:"",unitNo:"",roomNo:"",roomType:"",roomDirection:"",rentFee:"",propertyFee:"",rid:""},dialogFormVisible:!1,seleceResidence:[]}},methods:{async saveRoomData(){this.dialogFormVisible=!this.dialogFormVisible;const e=await this.$Api.addRoomAndupdataRoom(this.room);200==e.status&&(this.$message.success(e.message),this.$parent.getRoomData())},clearRoom(){this.room.buildingNo="",this.room.unitNo="",this.room.roomNo="",this.room.roomType="",this.room.roomDirection="",this.room.rentFee="",this.room.propertyFee="",this.room.rid="",this.room.roomId&&(this.room.roomId="")},async editRoom(e){const t=await this.$Api.getRoomById(e.roomId);200==t.status&&(this.room=t.data),this.dialogFormVisible=!0}}},b=h,f=(0,m.Z)(b,d,p,!1,null,"f2a42af2",null),g=f.exports,y={name:"Room",components:{AddRoom:g,HintButton:u},data(){return{roomData:[],currentPage:1,pageSize:10,total:0,residenceName:"",sreach:{rid:"",roomType:"",minrentFee:"",maxrentFee:""},center:"center",rules:{minrentFee:[{validator:this.validateMin,trigger:"blur"},{validator:this.validateNumber,trigger:"blur"}],maxrentFee:[{validator:this.validateNumber,trigger:"blur"},{validator:this.validateMax,trigger:"blur"}]}}},methods:{validateMin(e,t,o){if(""==t)return o();const r=Number(t),i=Number(this.sreach.maxrentFee);return!i||r<i?o():o(new Error("输入值不得大于最大阈值"))},validateMax(e,t,o){if(""==t)return o();const r=Number(t),i=Number(this.sreach.minrentFee);return!i||r>i?o():o(new Error("输入值不得小于最小阈值"))},validateNumber(e,t,o){if(""==t)return o();const r=Number(t);return Object.is(r,NaN)?o(new Error("请输入整数")):r<=0?o(new Error("请输入正整数")):o()},sreachRoom(){this.getRoomData()},async getRoomData(){const{currentPage:e,pageSize:t}=this,{rid:o,roomType:r,minrentFee:i,maxrentFee:a}=this.sreach,l=await this.$Api.getRoomPage(e,t,o||"",r||"",i||"",a||"");this.roomData=l.data,this.total=l.total},addRoom(){this.$refs.room.dialogFormVisible=!0,this.$refs.room.clearRoom(),this.$refs.room.seleceResidence=this.residenceName},async getResidenceName(){const e=await this.$Api.getRediencePage(1,10,"","","","");this.residenceName=e.data.map((e=>({name:e.name,rid:e.rid})))},updataRommds(e){this.$refs.room.editRoom(e)},deleteRoom(e){this.$confirm("此操作将永久删除该房间, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then((async()=>{const t=await this.$Api.deleteRoom(e.roomId);this.getRoomData(),this.$message.success(t.message)})).catch((()=>{this.$message.error("删除失败")}))},async goToline(e){const t=await this.$Api.Online(e);200==t.status&&(this.$message.success("上线成功"),this.getRoomData())},async leftLine(e){const t=await this.$Api.Offline(e);200==t.status&&(this.$message.success("下线成功"),this.getRoomData())}},mounted(){this.getRoomData(),this.getResidenceName()}},v=y,w=(0,m.Z)(v,r,i,!1,null,"6fa6060b",null),x=w.exports}}]);
//# sourceMappingURL=976.fba300fc.js.map