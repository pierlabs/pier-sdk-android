package br.com.conductor.pier.api.v2.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{arquivo_ajuste_lote_response_description}}}
 **/
@ApiModel(description = "{{{arquivo_ajuste_lote_response_description}}}")
public class ArquivoAjusteLoteResponse  {
  
  @SerializedName("dataProcessamento")
  private Date dataProcessamento = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("length")
  private Integer length = null;
  @SerializedName("lines")
  private Integer lines = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("srcName")
  private String srcName = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(Date dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_ajuste_lote_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_length_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_ajuste_lote_response_length_value}}}")
  public Integer getLength() {
    return length;
  }
  public void setLength(Integer length) {
    this.length = length;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_lines_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_ajuste_lote_response_lines_value}}}")
  public Integer getLines() {
    return lines;
  }
  public void setLines(Integer lines) {
    this.lines = lines;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_name_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_ajuste_lote_response_name_value}}}")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_ajuste_lote_response_status_value}}}")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_srcName_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_ajuste_lote_response_srcName_value}}}")
  public String getSrcName() {
    return srcName;
  }
  public void setSrcName(String srcName) {
    this.srcName = srcName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoAjusteLoteResponse {\n");
    
    sb.append("  dataProcessamento: ").append(dataProcessamento).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  length: ").append(length).append("\n");
    sb.append("  lines: ").append(lines).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  srcName: ").append(srcName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
