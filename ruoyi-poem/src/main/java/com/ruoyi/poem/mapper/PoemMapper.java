package com.ruoyi.poem.mapper;

import com.ruoyi.poem.domain.Poem;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author 范佳兴
 * @date 2024/12/31 16:30
 */
@Mapper
public interface PoemMapper {

    /**
     * 获取所有古诗词
     *
     * @return 古诗词列表
     */
    List<Poem> getAllPoems();

    /**
     * 根据诗词ID获取诗词详情
     *
     * @param poemId 诗词ID
     * @return 诗词详情
     */
    Poem getPoemById(Long poemId);

    /**
     * 获取用户PoemCount
     *
     * @return 用户PoemCount
     */
    List<Long> getTopUsersByPoemCount();

    /**
     * 根据用户ID获取用户Poem
     *
     * @param userId 用户ID
     * @return 用户Poem
     */
    List<Poem> getPoemByUserId(Long userId);

    /**
     * 添加古诗词
     *
     * @param poem 古诗词信息
     * @return 影响行数
     */
    int addPoem(Poem poem);

    /**
     * 更新古诗词
     *
     * @param poem 古诗词信息
     * @return 影响行数
     */
    int updatePoem(Poem poem);

    /**
     * 删除古诗词
     *
     * @param poemId 诗词ID
     * @return 影响行数
     */
    int deletePoem(Long poemId);
}
