$(function(){
		$("#name").blur(function(){
			val_name();
		});
		$("#id_card").blur(function(){
			val_id_card();
		});
		$("#phone_number").blur(function(){
			val_phone();
		});
		$("#address").blur(function(){
			val_address();
		});
		
		$("#submit").click(function(){
			alert("a");
			if(val_name() == false) return false;
			if(val_id_card() == false) return false;
			if(val_phone() == false) return false;
			if(val_address() == false) return false;
			return true;
		})
});

function val_name(){
	var name = $("#name").val();
	if(name == ""){
		$("#name_val").text("名称不能为空");
		return false;
	}else{
		$("#name_val").text("");
		return true;
	}
}

function val_id_card(){
	var id_card = $("#id_card").val();
	if(id_card == ""){
		$("#id_card_val").text("身份证不能为空");
		return false;
	}else if(isIdCardNo(id_card) != true){
		$("#id_card_val").text(isIdCardNo(id_card));
		return false;
	}else{
		$("#id_card_val").text("");
		return true;
	}
}

function val_phone(){
	var phone_number = $("#phone_number").val();
	//验证手机
	var pattern=/^13[0-9]{9}$|14[0-9]{9}|15[0-9]{9}$|18[0-9]{9}$/;

	if(phone_number == ""){
		$("#phone_number_val").text("电话号码不能为空");
		return false;
	}else if(!(pattern.test(phone_number))){
		$("#phone_number_val").text("电话号码格式错误");
		return false;
	}else{
		$("#phone_number_val").text("");
		return true;
	}
	
}

function val_address(){
	var address = $("#address").val();
	if(address == ""){
		$("#address_val").text("地址不能为空");
		return false;
	}else{
		$("#address_val").text("");
		return true;
	}
}


function isIdCardNo(num) {
    //权重值
    var factorArr = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1);

    //校验码
    var parityBit = new Array("1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2");

    //地区码省级  @todo市级地级代码也可以枚举
    var provinces = {11: "北京", 12: "天津", 13: "河北", 14: "山西", 15: "内蒙古", //华北两市三省
        21: "辽宁", 22: "吉林", 23: "黑龙江", //东北三省
        31: "上海", 32: "江苏", 33: "浙江", 34: "安徽", 35: "福建", 36: "江西", 37: "山东", //华东一市六省
        41: "河南", 42: "湖北", 43: "湖南", 44: "广东", 45: "广西", 46: "海南", //华南五省
        50: "重庆", 51: "四川", 52: "贵州", 53: "云南", 54: "西藏",//西南一市四省
        61: "陕西", 62: "甘肃", 63: "青海", 64: "宁夏", 65: "新疆",//西北五省
        71: "台湾",
        81: "香港", 82: "澳门",
        91: "国外"}; 

    var varArray = new Array();    
    var intweightSum = 0;
    var intCheckDigit;

    var intStrLen = num.length;
    var idNumber = num.toString().toUpperCase();

    // 基本位数判断
    if ((intStrLen != 15) && (intStrLen != 18)) {
        return '身份证号为18位!';
    }
    
    //省级信息 @todo 可以枚举市级 和 县级 区域的
    if (provinces[parseInt(idNumber.substr(0, 2))] == null) {
        return '身份证号前六位地区码有误!';
    }

    // 判断每一位字符，顺便计算加权值
    for (i = 0; i < intStrLen; i++) {
        varArray[i] = idNumber.charAt(i);
        if ((varArray[i] < '0' || varArray[i] > '9') && (i != 17)) {
            return '身份证号有错误字符!';
        } else if (i < 17) {
            varArray[i] = varArray[i] * factorArr[i];
            intweightSum = intweightSum + varArray[i];
        }
    }
    
    if (intStrLen == 18) {         
        //生日期校验
        var date8 = idNumber.substring(6, 14);
        if (isDate8(date8) == false) {
            return '身份证出生日期错误!';
        }
        
        // 校验码验证  余数在校验数组中的值
        intCheckDigit = parityBit[intweightSum % 11];
        
        // 最后一位和计算出的校验码是否一致
        if (varArray[17] != intCheckDigit) {
            return '身份证号有误，校验失败!';
        }
    } else {
        var date6 = idNumber.substring(6, 12);
        if (isDate6(date6) == false) {
            return '身份证出生日期错误!';
        }
    }
    return true;
}

function isDate8(sDate) {
    if (!/^[0-9]{8}$/.test(sDate)) {
        return false;
    }
    var year, month, day;
    year = sDate.substring(0, 4);
    month = sDate.substring(4, 6);
    day = sDate.substring(6, 8);
    var iaMonthDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    if (year < 1700 || year > 2500)
        return false
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        iaMonthDays[1] = 29;
    if (month < 1 || month > 12)
        return false
    if (day < 1 || day > iaMonthDays[month - 1])
        return false
    return true
}

function isDate6(sDate) {
    if (!/^[0-9]{6}$/.test(sDate)) {
        return false;
    }
    var year, month, day;
    year = sDate.substring(0, 4);
    month = sDate.substring(4, 6);
    if (year < 1700 || year > 2500)
        return false
    if (month < 1 || month > 12)
        return false
    return true
}
