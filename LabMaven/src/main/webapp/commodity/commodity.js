$(document).ready(function(){
	$.postJSON = function(url, data, callback) {
        return jQuery.ajax({
            'type' : 'POST',
            'url' : url,
            'contentType' : 'application/json',
            'data' : JSON.stringify(data),
            'dataType' : 'json',
            'success' : callback
        });
    };

			var contentdata=[
			{'name':'goodsname','type':'text','title':'物品名称','required':'true'},
			{'name':'purchaseid','type':'text','title':'申请单号','required':'true'},
			{'name':'departmentname','type':'text','title':'申请部门','required':'false'},
			{'name':'username','type':'text','title':'申请人','required':'false'},
			{'name':'applytime','type':'date','title':'申请日期','required':'true'},
			{'name':'brands','type':'text','title':'品牌','required':'true'},
			{'name':'itemnumber','type':'text','title':'货号','required':'true'},
			{'name':'number','type':'number', 'title':'采购数量','required':'true'},
			{'name':'price','type':'float','title':'采购金额','required':'true'},
			{'name':'actualprice','type':'float','title':'采购价格','required':'true','readonly':'yes'},
			{'name':'unitName','type':'text','title':'规格单位','required':'true'},
			{'name':'norm','type':'number','title':'规格数量','required':'true'},
			{'name':'invoicestatus','type':'select','items':[{'text':'未开票','value':'未开票'},{'text':'已开票','value':'已开票'},{'text':'其它','value':'其它'}],'title':'开票状态','required':'true'},
			{'name':'paymentstatus','type':'select','items':[{'text':'未付款','value':'未付款'},{'text':'已付款','value':'已付款'},{'text':'其它','value':'其它'}],'title':'付款状态','required':'true'},
			{'name':'status','type':'select','items':[{'text':'未到货','value':'未到货'},{'text':'已到货','value':'已到货'},{'text':'其它','value':'其它'}],'title':'状态','required':'true'},
			{'name':'category','type':'text','title':'类别','required':'false'},
			{'name':'inventory','type':'float','title':'库存','required':'true'},
			{'name':'function','type':'textarea','title':'用途','required':'false'},
			{'name':'remark','type':'textarea','title':'备注','required':'false'},
			{'name':'descritpion','type':'textarea','title':'说明','required':'false'},
			
			];
			
			
			div1=Element('div',[{"id":"","class":'control-group span8'}],'');
			label=Element('label',[{"id":"","class":'control-label'}],'label');
			div2=Element('input',[{'type':"text","id":"","class":'abc input-default','name':'goodsname'}],'');
			

		
		contentAdd('J_Form1',contentdata);
		function contentAdd(id,data){
			var main=document.getElementById(id);
			var today=new Date(); 
			var nowtime;
			var nowtime=today.getFullYear()+'-'+ ((today.getMonth() + 1).toString().length==1?("0" + (today.getMonth()+1)) : (today.getMonth()+1) )+ '-' +
			 (today.getDate().toString().length==1?'0'+today.getDate():today.getDate());
			for(var index in data){
				if(index%2==0){
					divrow=Element('div',[{"id":"","class":'row'}],'');
					main.appendChild(divrow);
				}
				if(data[index].type == 'text'){
					div1=Element('div',[{"id":"","class":'control-group span8'}],'');
					label=Element('label',[{"id":"","class":'control-label'}],data[index].title);
					div2=Element('div',[{"id":"","class":'controls'}],'');
					input=Element('input',[{'type':"text","id":"","class":'input-normal control-text','name':data[index].name},{'data-rules':'{required:'+data[index].required+'}'}],'');
					divrow.appendChild(div1);
					div1.appendChild(label);
					div1.appendChild(div2);
					div2.appendChild(input);
				}
				if(data[index].type == 'number'){
					div1=Element('div',[{"id":"","class":'control-group span8'}],'');
					label=Element('label',[{"id":"","class":'control-label'}],data[index].title);
					div2=Element('div',[{"id":"","class":'controls'}],'');
					input=Element('input',[{'type':"number","id":"","class":'input-normal control-text','name':data[index].name},{'data-rules':'{required:'+data[index].required+'}'}],'');
					divrow.appendChild(div1);
					div1.appendChild(label);
					div1.appendChild(div2);
					div2.appendChild(input);
				}
				if(data[index].type == 'float'){
					div1=Element('div',[{"id":"","class":'control-group span8'}],'');
					label=Element('label',[{"id":"","class":'control-label'}],data[index].title);
					div2=Element('div',[{"id":"","class":'controls'}],'');
					input=Element('input',[{'type':"number", 'step':"0.01" ,"id":"","class":'input-normal control-text','name':data[index].name},{'data-rules':'{required:'+data[index].required+'}'}],'');
					divrow.appendChild(div1);
					div1.appendChild(label);
					div1.appendChild(div2);
					div2.appendChild(input);
				}
				if(data[index].type == 'date'){
					div1=Element('div',[{"id":"","class":'control-group span8'}],'');
					label=Element('label',[{"id":"","class":'control-label'}],data[index].title);
					div2=Element('div',[{"id":"","class":'controls'}],'');
					input=Element('input',[{'type':"text","id":"","class":'calendar','name':data[index].name},{'data-rules':'{required:'+data[index].required+'}'}],'');
					divrow.appendChild(div1);
					div1.appendChild(label);
					div1.appendChild(div2);
					div2.appendChild(input);
				}
				if(data[index].type == 'textarea'){
					div1=Element('div',[{"id":"","class":'control-group span8 '}],'');
					label=Element('label',[{"id":"","class":'control-label'}],data[index].title);
					div2=Element('div',[{"id":"","class":'controls control-row4'}],'');
					input=Element('textarea',[{"id":"","class":'input-normal  control-text','name':data[index].name},{'data-rules':'{required:'+data[index].required+'}'}],'');
					divrow.appendChild(div1);
					div1.appendChild(label);
					div1.appendChild(div2);
					div2.appendChild(input);
				}
				if(data[index].type == 'select'){
					div1=Element('div',[{"id":"","class":'control-group span8'}],'');
					label=Element('label',[{"id":"","class":'control-label'}],data[index].title);
					div2=Element('div',[{"id":"","class":'controls'}],'');
					select=Element('select',[{"id":"","class":'input-normal','name':data[index].name}],'');
					option = Element('option',[{"id":"","class":'','value':''}],'请选择');
					select.appendChild(option);
					for(var obj in data[index].items){
						option = Element('option',[{"id":"","class":'','value':data[index].items[obj].value}],data[index].items[obj].text);
						select.appendChild(option);
					}
					divrow.appendChild(div1);
					div1.appendChild(label);
					div1.appendChild(div2);
					div2.appendChild(select);
				}
			}	
		}
		function Element(name,array ,test){
				var ele=document.createElement(name);
				$.each(array, function(key,value) {
					$.each(value, function(key1,value1) {
						ele.setAttribute(key1,value1);
						//console.log(key1+"===="+value1);
					});
				});
				if(name.toLowerCase()!="input"  ){
					ele.innerText=test;
				}
				
				return ele;
			}
		   	$("#grid").empty();
  		/* BUI框架-头部	***************************************************/		
 		BUI.use(['bui/grid','bui/data','bui/form'],function (Grid,Data,Form) {
			 var today=new Date(); 
			var nowtime;
			var nowtime=today.getFullYear()+'-'+ ((today.getMonth() + 1).toString().length==1?("0" + (today.getMonth()+1)) : (today.getMonth()+1) )+ '-' +
			 (today.getDate().toString().length==1?'0'+today.getDate():today.getDate());
		    //单元格编辑插件
		   var timesamp;
		    var columns  = [
	          	{title:'序号',dataIndex:'id',width:50},
	          	 {title:'物品名称',dataIndex:'goodsname',editor:{xtype : 'text',rules:{required:true}},width:200},
	            {title:'申请单号',dataIndex:'purchaseid',editor:{xtype : 'text',rules:{required:false}},width:80},
	            {title:'申请部门',dataIndex:'departmentname',editor:{xtype : 'text',rules:{required:false}},width:60},
	            {title:'申请人',dataIndex:'username',editor:{xtype : 'text',rules:{required:false}},width:60,},
	            {title:'申请日期',dataIndex:'applytime',editor : {xtype : 'date'},renderer : Grid.Format.dateRenderer ,width:100},
	            {title:'品牌',dataIndex:'brands',editor:{xtype : 'text',rules:{required:false}},width:80},
	            {title:'货号',dataIndex:'itemnumber',editor:{xtype : 'text',rules:{required:false}},width:120},
	            {title:'采购数量',dataIndex:'number',editor:{xtype : 'number',rules:{required:false}},width:80},
	            {title:'采购金额',dataIndex:'price',editor:{xtype : 'number',rules:{required:false}},width:80},
	            {title:'规格单位',dataIndex:'unitName',editor:{xtype : 'text',rules:{required:false}},width:80},
	            {title:'规格数量',dataIndex:'norm',editor:{xtype : 'number',rules:{required:false}},width:80},
	            {title:'开票状态',dataIndex:'invoicestatus',editor:{xtype : 'select',items:[{'text':'未开票','value':'未开票'},{'text':'已开票','value':'已开票'},{'text':'其它','value':'其它'}],rules:{required:true}},width:70},
	            {title:'付款状态',dataIndex:'paymentstatus',editor:{xtype : 'select',items:[{'text':'未付款','value':'未付款'},{'text':'已付款','value':'已付款'},{'text':'其它','value':'其它'}],rules:{required:true}},width:70},
	            {title:'状态',dataIndex:'status',editor:{xtype : 'select',items:[{'text':'未到货','value':'未到货'},{'text':'已','value':'已到货'},{'text':'其它','value':'其它'}],rules:{required:true}},width:70},
	            {title:'用途',dataIndex:'function',editor:{xtype : 'text',rules:{required:false}},width:150},
	            {title:'备注',dataIndex:'remark',editor:{xtype : 'textarea'},width:150},
	            {title:'操作',renderer:function(value,obj,index){
	            	console.log(obj);
	            	return '<span class="grid-command btn-edit center">编辑</span>'+'<a href="Editcommodity.html?id='+obj.id+'">使用</a>';
	            },width:120}
	          ];
	          Store = Data.Store,
	           store = new Store({
	           		url:'/LabMaven/commodity/queryCommodityByPage',
	           		autoLoad:true,
	           		method: "post",
				    params:{
				    //bianliang1:xxxxx, //传参
				     //bianliang2:xxxxx 
				    },
				    proxy:{
				    	method:'POST',
				    	save:{
				    		updateUrl:'/LabMaven/commodity/updateCommodity',
				    		addUrl:'/LabMaven/commodity/addCommodity',
				    		
				    		
				    	},
				    	//save:'/LabMaven/commodity/test',
				    	dataType:'json',
				    },
				    pageSize:30,
				  });
				  console.log(store);
				  store.on('saved',function (ev) {
			          var type = ev.type, //保存类型，add,remove,update
			            saveData = ev.saveData, //保存的数据
			            data = ev.data; //返回的数据
			          console.log(type);
			          //TO DO
			          if(type == 'add'){ //新增记录时后台返回id
			           console.log(saveData);
			           console.log(data);
			          }else if(type == 'update'){
			        	  console.log(saveData);
				           console.log(data);
			          }else{
			            //BUI.Message.Alert('删除成功！');
			          }
			        });
			editing = new Grid.Plugins.DialogEditing({
		        contentId : 'content',
		        triggerCls : 'btn-edit',
		        editor: {
	            title: '编辑'
	            },
	            autoSave : true //自动添加和更新
		      }),
	        grid = new Grid.Grid({
	          render : '#grid', //显示Grid到此处
	          width:'1280',      //设置宽度
	          columns :columns,
	          loadMask: true,
	           forceFit : true,
			    store : store,
			    plugins : [Grid.Plugins.CheckSelection,editing],
			    tbar:{
			        items : [{
			          btnCls : 'button button-small',
			          text : '<i class="icon-plus"></i>添加',
			          listeners : {
			            'click' : addFunction
			          }
			        },
			        {
			          btnCls : 'button button-small',
			          text : '<i class="icon-remove"></i>删除',
			          listeners : {
			            'click' : delFunction
			          }
			        }]
			    },
			    bbar:{
	                // pagingBar:表明包含分页栏
	                pagingBar:true
	            }
	        });
	      grid.render();
	      function addFunction(){
		       var newData = {'applytime':nowtime};
				editing.add(newData); //添加记录后，直接编辑
				console.log(newData);
		     // editing.edit(); //添加记录后，直接编辑
		    }
		
		    function delFunction(){
		      var selections = grid.getSelection();
		     
		      if(selections ==false ){
		      	alert("请选择要删除的选项！");
		      }else{
		      	if(confirm("您确定要删除吗？")){
		      		  console.log("********start*******");
				      var checkid=new Array();
		      		 for(var index=0; index< selections.length;index++){
		      			checkid.push(selections[index].id);
				      } 
				      console.log(checkid.toString());
				      $.ajax({
				      	url: "/LabMaven/commodity/deletecommodity",
				      	type: "POST",
			      		data:{'deleteId':checkid.toString()},
			      		
			      		success:function(result){
		      				store.remove(selections);
		      				pageflash();
			      		},
			      		error: function(erro){
			      			console.log("ajax错误,删除失败")
			      		}
				      });
				      console.log("*********end******");
				      
		      	}
		      }
		     
		    }
		
		    var form = new Form.HForm({
		      srcNode : '#J_Form'
		    });
		    form.render();
			var field = form.getField('eduation');
		    form.on('beforesubmit',function(){
		      var records = store.getResult();
		      field.set('value',BUI.JSON.stringify(records));
		    });
		    
		    
		    
		    
	  });
	
	/* BUI框架-尾部***************************************************/	
			
		   
		
	})
	/*文件提交检查*/
	  function checkData(){    
		   var fileDir = $("#upfile").val();    
		   var suffix = fileDir.substr(fileDir.lastIndexOf("."));    
		   if("" == fileDir){    
		       alert("选择需要导入的Excel文件！");    
		       return false;    
		   }    
		   if(".xls" != suffix && ".xlsx" != suffix ){    
		       alert("选择Excel格式的文件导入！");    
		       return false;    
		   }    
		   var form = document.getElementById("upload");
		   formData = new FormData(form);
		   $.ajax({
		   		url:"/LabMaven/commodity/addLargecommodity",
		   		type:"post", 
	   	 		data:formData, 
	  	 		processData:false, 
	   	 		contentType:false, 
	  	 		success:success, 
	  			error:function(err){ 
	   				 alert("请确保必填项无缺失",err); 
	   			} 
			   		
		   })
		   function success(res){ 
		   		$("#grid").empty();
		     	if(res!=null){ 
			      	alert("数据导入成功！");
			      	
			 		pageflash();
			    }else{
					alert("导入失败，请检查字段顺序并确保必填项无缺失！");
				}}
		   
		}  
		 
  		function pageflash(){
  			if(top.topManager){
			      		top.topManager.reloadPage();
			      	}else{
			      		window.location.reload();
			      	}
  		}