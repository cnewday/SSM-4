<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String projectPath=basePath+"view";
Long time=System.currentTimeMillis();
System.out.println("${alltraining_types}");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Training.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="<%=projectPath %>/css/bootstrap.min.css" rel="stylesheet" />
<link href="<%=projectPath %>/css/Eworks.css" rel="stylesheet" />



<script src="<%=projectPath %>/js/jquery-1.8.3.min.js"></script>

<link href="<%=projectPath %>/control/css/zyUpload.css" rel="stylesheet" />
<script src="<%=projectPath %>/control/js/zyUpload.js"></script>

<script src="<%=projectPath %>/js/location.js"></script>
<script src="<%=projectPath %>/js/area.js"></script>
<script src="<%=projectPath %>/core/zyFile.js"></script>
</head>
<body>
	<div class="container">
		<div class="header">
			<div class="title">
				<span>e创中心</span>
			</div>
		</div>
		<div class="e_works_con">
			<div>
				<label>标题：</label><input type="text" class="input" id="titile" />
			</div>
			<div class="clear address">
				<label class="e_works_con_label">所在区域：</label>
				<div style="float:left;width:50%;">
					<select id="loc_province">

						<option>选择省份</option>
					</select>&nbsp;&nbsp;&nbsp; <select id="loc_city">
						<option>选择城市</option>

					</select>&nbsp;&nbsp;&nbsp; <select id="loc_town">
						<option>选择区域</option>

					</select>
				</div>
			</div>

			<div class="clear">
				<label>详细地址：</label> <input type="text" class="input"
					id="detailed_address" />
			</div>
			<div class="clear">
				<label class="e_works_con_label">类型：</label>
				<div style="float:left; width:50%; margin-top:0px;">
					<ul class="gq">
						<c:forEach items="${alltraining_types}" var="training_type">
							<li><input type="radio" name="supply"
								value=${training_type.trainingTypeId } />${training_type.title}</li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="clear">
				<label>价格：</label> <input type="text" class="insert" id="price" />
			</div>

			<div>
				<label class="label_align" style="float:left">培训展示：</label>
				<div id="show" class="show"></div>

			</div>


			<div class="clear">
				<label class="label_align" style="margin-top:20px;" id="content">详细说明：</label>
				<textarea style="margin-top:20px;"></textarea>
			</div>
			<div>
				<label>电话：</label> <input type="text" class="insert" id="telphone" pattern="^0?1[3|4|5|8][0-9]\d{8}$" required="required"
  title="请输入正确的电话号码"/>
			</div>
			<div>
				<label>联系人：</label> <input type="text" class="insert" id="contact" />
			</div>
			<div>
				<label></label> <input type="button" value="确认发布" class="submit" />
			</div>


		</div>
	</div>

</body>
<script type="text/javascript">

/**
选择城市
**/
$(document).ready(function(){
		showLocation();
	});

	$(".submit").click(function(){
	$.post("<%=basePath %>TrainingController/addTraining.do",{
	titile:$("#titile").val(),
	provinceId:$('#loc_province option:selected').val(),
	cityId:$('#loc_city option:selected').val(),
	areaId:$('#loc_town option:selected').val(),
	trainingTypeId:$("input[name='supply']:checked").val(),
	userId:3,
	price:$("#price").val(),
	telphone:$("#price").val(),
	contact:$("#contact").val(),
	createTime:<%=34 %>,
	trainingPicture:JSON.stringify(successpath),
	content:$("#price").val(),
	detailedAddress:$("#detailed_address").val()
	},function(data){
	   alert(data);
	});
	});
	
	 $(function () {
	 /**
记录成功的数据
**/
var successpath=new Array();
        // 初始化插件
     $("#show").zyUpload({
            width: "650px",                 // 宽度
            height: "300px",                 // 宽度
            float: "left",                  // 左漂浮
            itemWidth: "120px",                 // 文件项的宽度
            itemHeight: "100px",                 // 文件项的高度
            url: "<%=basePath%>/upload/UploadAction.do",  // 上传文件的路径
            multiple: true,                    // 是否可以多个文件上传
            dragDrop: true,                    // 是否可以拖动上传文件
            del: true,                    // 是否可以删除文件
            finishDel: false,  				  // 是否在上传文件完成后删除预览
            basePath:"<%=basePath%>",
            /* 外部获得的回调接口 */
            onSelect: function (files, allFiles) {                    // 选择文件的回调方法
                console.info("当前选择了以下文件：");
                console.info(files);
                console.info("之前没上传的文件：");
                console.info(allFiles);
            },

            onDelete: function (file,Files) { 
           alert("删除成功！")
           alert(file.name);
           Array.prototype.remove=function(obj){  
						    for(var i =0;i <this.length;i++){  
						        var temp = this[i];  
						        if(!isNaN(obj)){  
						            temp=i;  
						        }  
						        if(temp == obj){  
						            for(var j = i;j <this.length;j++){  
						                this[j]=this[j+1];  
						            }  
						            this.length = this.length-1;  
						        }     
						    }  
						}  
					  if(successpath.length>0)
						{
						for(var i=0;i<successpath.length;i++)
							{
							if(successpath[i].indexOf(file.name) > 0)
								{
								$.post("<%=basePath %>upload/deleteFile.do",{file:successpath[i]});
								successpath.remove(i);
								}
							
							}
						}
						$("#uploadList_" + file.index).fadeOut();
						// 重新设置统计栏信息
						console.info("剩下的文件");
						console.info(files);
            },
            onSuccess: function (file) {                    // 文件上传成功的回调方法
						$("#uploadProgress_" + file.index).hide();
						$("#uploadSuccess_" + file.index).show();
						successpath.push(response)
//						$("#uploadInf").append("<p>上传成功，文件地址是：" + response + "</p>");
						// 根据配置参数确定隐不隐藏上传成功的文件
						if(this.finishDel){
							// 移除效果
							$("#uploadList_" + file.index).fadeOut();
							// 重新设置统计栏信息
						}	
	          console.info("此文件上传成功：");
                console.info(file);
            },
            onFailure: function (file) {                    // 文件上传失败的回调方法
                console.info("此文件上传失败：");
                console.info(file);
            },
            onComplete: function (responseInfo) {           // 上传完成的回调方法
                console.info("文件上传完成");
                console.info(responseInfo);
            }
     
        });
    }
    
    );

	
</script>
</html>
