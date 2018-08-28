package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class BinChaveUpdate  {
  
  @SerializedName("chave")
  private String chave = null;
  @SerializedName("checkValue")
  private String checkValue = null;
  @SerializedName("flagDescriptografado")
  private Boolean flagDescriptografado = null;
  @SerializedName("idBin")
  private Long idBin = null;
  @SerializedName("idTipoChave")
  private Long idTipoChave = null;
  @SerializedName("label")
  private String label = null;
  @SerializedName("validade")
  private String validade = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCheckValue() {
    return checkValue;
  }
  public void setCheckValue(String checkValue) {
    this.checkValue = checkValue;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagDescriptografado() {
    return flagDescriptografado;
  }
  public void setFlagDescriptografado(Boolean flagDescriptografado) {
    this.flagDescriptografado = flagDescriptografado;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdBin() {
    return idBin;
  }
  public void setIdBin(Long idBin) {
    this.idBin = idBin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdTipoChave() {
    return idTipoChave;
  }
  public void setIdTipoChave(Long idTipoChave) {
    this.idTipoChave = idTipoChave;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getValidade() {
    return validade;
  }
  public void setValidade(String validade) {
    this.validade = validade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinChaveUpdate {\n");
    
    sb.append("  chave: ").append(chave).append("\n");
    sb.append("  checkValue: ").append(checkValue).append("\n");
    sb.append("  flagDescriptografado: ").append(flagDescriptografado).append("\n");
    sb.append("  idBin: ").append(idBin).append("\n");
    sb.append("  idTipoChave: ").append(idTipoChave).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  validade: ").append(validade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
