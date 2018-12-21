package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoDetalhesPersist;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object File for the dates persistence
 **/
@ApiModel(description = "Object File for the dates persistence")
public class ArquivoPersist  {
  
  @SerializedName("idTipoArquivo")
  private Long idTipoArquivo = null;
  @SerializedName("arquivo")
  private String arquivo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("extensao")
  private String extensao = null;
  public enum TipoComunicacaoEnum {
     SOAP,  REST, 
  };
  @SerializedName("tipoComunicacao")
  private TipoComunicacaoEnum tipoComunicacao = null;
  @SerializedName("detalhes")
  private List<ArquivoDetalhesPersist> detalhes = null;

  
  /**
   * File type
   **/
  @ApiModelProperty(value = "File type")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * Content of the converted file in base 64
   **/
  @ApiModelProperty(required = true, value = "Content of the converted file in base 64")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * File name
   **/
  @ApiModelProperty(value = "File name")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * File extension
   **/
  @ApiModelProperty(value = "File extension")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Communication Type
   **/
  @ApiModelProperty(value = "Communication Type")
  public TipoComunicacaoEnum getTipoComunicacao() {
    return tipoComunicacao;
  }
  public void setTipoComunicacao(TipoComunicacaoEnum tipoComunicacao) {
    this.tipoComunicacao = tipoComunicacao;
  }

  
  /**
   * Details containing additional information, related to the file
   **/
  @ApiModelProperty(required = true, value = "Details containing additional information, related to the file")
  public List<ArquivoDetalhesPersist> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<ArquivoDetalhesPersist> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoPersist {\n");
    
    sb.append("  idTipoArquivo: ").append(idTipoArquivo).append("\n");
    sb.append("  arquivo: ").append(arquivo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("  tipoComunicacao: ").append(tipoComunicacao).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
